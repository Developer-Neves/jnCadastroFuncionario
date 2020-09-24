package com.jdneves.spring.dao;

import java.time.LocalDate;
import java.util.List;

import com.jdneves.spring.domain.Funcionario;

public interface FuncionarioDao {

	void save(Funcionario funcionario);
	
	void update(Funcionario funcionario);

	void delete(Long id);
	
	Funcionario findById(Long id);
	
	List<Funcionario> findAll();
	
	List<Funcionario> findByName(String nome);

	List<Funcionario> findByCargoId(Long id);

	List<Funcionario> findByDataEntradaSaida(LocalDate entrada, LocalDate saida);

	List<Funcionario> findByDataEntrada(LocalDate entrada);

	List<Funcionario> findByDataSaida(LocalDate saida);
}
