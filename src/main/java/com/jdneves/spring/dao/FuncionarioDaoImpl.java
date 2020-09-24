package com.jdneves.spring.dao;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.jdneves.spring.domain.Funcionario;

@Repository
public class FuncionarioDaoImpl extends AbstractDao<Funcionario, Long> implements FuncionarioDao{

	// Fazendo a busca por nome do funcionário
	@Override
	public List<Funcionario> findByName(String nome) {		
		// Query opcional
		/*TypedQuery<Funcionario> query = (TypedQuery<Funcionario>) getEntityManager()
				.createQuery("SELECT f FROM Funcionario f WHERE f.nome LIKE :nome", Funcionario.class);		
		query.setParameter("nome", nome);		
		return query.getResultList(); */
		
		// Usando o método criado no abstractDao
		return createQuery("SELECT f FROM Funcionario f WHERE f.nome LIKE concat('%',?1,'%') ", nome);
	}

	@Override
	public List<Funcionario> findByCargoId(Long id) {
		
		return createQuery("SELECT f FROM Funcionario f WHERE f.cargo.id = ?1", id);
	}

	@Override
	public List<Funcionario> findByDataEntradaSaida(LocalDate entrada, LocalDate saida) {
		String jpql = new StringBuilder("SELECT f FROM Funcionario f ")
				.append("WHERE f.dataEntrada >= ?1 and f.dataSaida <= ?2 ")
				.append("ORDER BY f.dataEntrada ASC")
				.toString();
		return createQuery(jpql, entrada, saida);
	}

	@Override
	public List<Funcionario> findByDataEntrada(LocalDate entrada) {
		String jpql = new StringBuilder("SELECT f FROM Funcionario f ")
				.append("WHERE f.dataEntrada = ?1 ")
				.append("ORDER BY f.dataEntrada ASC")
				.toString();
		return createQuery(jpql, entrada);
	}

	@Override
	public List<Funcionario> findByDataSaida(LocalDate saida) {
		String jpql = new StringBuilder("SELECT f FROM Funcionario f ")
				.append("WHERE f.dataSaida = ?1 ")
				.append("ORDER BY f.dataSaida ASC")
				.toString();
		return createQuery(jpql, saida);
	}

	

}
