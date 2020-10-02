package com.jdneves.spring.dao;

import java.util.List;

import com.jdneves.spring.domain.Cargo;
import com.jdneves.spring.util.PaginacaoUtil;

public interface CargoDao {

	void save(Cargo cargo);
	
	void update(Cargo cargo);

	void delete(Long id);
	
	Cargo findById(Long id);
	
	List<Cargo> findAll();
	
	PaginacaoUtil<Cargo> buscaPaginada(Integer pagina, String ordenacao);	
}
