package com.jdneves.spring.service;

import java.util.List;

import com.jdneves.spring.domain.Funcionario;

public interface FuncionarioService {

	void salvar(Funcionario cargo);
	
	void editar(Funcionario cargo);
	
	void excluir(Long id);
	
	Funcionario buscarPorId(Long id);
	
	List<Funcionario> buscarTodos();
}
