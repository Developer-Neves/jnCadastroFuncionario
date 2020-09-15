package com.jdneves.spring.dao;

import java.util.List;

import com.jdneves.spring.domain.Departamento;

public interface DepartamentoDao {
	
	void save(Departamento departamento);
	
	void upadate(Departamento departamento);

	void delete(Long id);
	
	Departamento findById(Long id);
	
	List<Departamento> findAll();
}
