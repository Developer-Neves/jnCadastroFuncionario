package com.jdneves.spring.dao;

import org.springframework.stereotype.Repository;

import com.jdneves.spring.domain.Cargo;

@Repository
public class CargoDaoImpl extends AbstractDao<Cargo, Long>  implements CargoDao {

	@Override
	public void upadate(Cargo cargo) {
		// TODO Auto-generated method stub		
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
	}

}
