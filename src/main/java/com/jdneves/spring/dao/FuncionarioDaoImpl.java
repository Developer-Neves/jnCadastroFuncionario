package com.jdneves.spring.dao;

import org.springframework.stereotype.Repository;

import com.jdneves.spring.domain.Funcionario;

@Repository
public class FuncionarioDaoImpl extends AbstractDao<Funcionario, Long> implements FuncionarioDao{

	@Override
	public void upadate(Funcionario funcionario) {
		// TODO Auto-generated method stub		
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub		
	}

}
