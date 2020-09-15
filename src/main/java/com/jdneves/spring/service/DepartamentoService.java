package com.jdneves.spring.service;

import java.util.List;

import com.jdneves.spring.domain.Departamento;

public interface DepartamentoService {

	void salvar(Departamento cargo);
	
	void editar(Departamento cargo);
	
	void excluir(Long id);
	
	Departamento buscarPorId(Long id);
	
	List<Departamento> buscarTodos();
}
