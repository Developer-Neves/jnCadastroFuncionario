package com.jdneves.spring.dao;

import java.util.List;

import com.jdneves.spring.domain.Funcionario;

public interface FuncionarioDao {

	void save(Funcionario funcionario);
	
	void upadate(Funcionario funcionario);

	void delete(Long id);
	
	Funcionario findById(Long id);
	
	List<Funcionario> findAll();
}
