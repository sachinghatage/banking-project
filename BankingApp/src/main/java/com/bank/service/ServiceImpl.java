package com.bank.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.entity.Entities;
import com.bank.repository.Repository;

@Service
public class ServiceImpl implements Service1{

	@Autowired
	private Repository repo;
	
	@Override
	public Entities saveEntity(Entities entity) {
		// TODO Auto-generated method stub
		return repo.save(entity);
	}

	

}
