package com.jdneves.spring.dao;

import java.util.List;

import com.jdneves.spring.domain.Cargo;

public interface CargoDao {

	void save(Cargo cargo);
	
	void upadate(Cargo cargo);

	void delete(Long id);
	
	Cargo findById(Long id);
	
	List<Cargo> findAll();
	
}