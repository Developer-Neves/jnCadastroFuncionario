package com.jdneves.spring.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.jdneves.spring.domain.Cargo;
import com.jdneves.spring.util.PaginacaoUtil;

@Repository
public class CargoDaoImpl extends AbstractDao<Cargo, Long>  implements CargoDao {

	public PaginacaoUtil<Cargo> buscaPaginada(Integer pagina, String ordenacao){
		Integer tamanho = 5;
		Integer inicio = (pagina - 1) * tamanho; 
		List<Cargo> cargos = getEntityManager()
				.createQuery("SELECT c FROM Cargo c ORDER BY c.nome " + ordenacao, Cargo.class)
				.setFirstResult(inicio)
				.setMaxResults(tamanho)
				.getResultList();
		Long totalRegistros = count();
		Long totalDePaginas = (totalRegistros + (tamanho - 1)) / tamanho;
		return new PaginacaoUtil<>(tamanho, pagina, totalDePaginas, ordenacao, cargos);
	}
	
	public Long count() {
		return getEntityManager()
				.createQuery("SELECT COUNT(*) FROM Cargo", Long.class)
				.getSingleResult();
	}
	
	
}
