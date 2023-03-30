package com.bank.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.bank.entity.Entities;
import com.bank.service.Service1;


@Controller
public class Controllers {
	
	@Autowired
	private Service1 service;
	
	@PostMapping("/register")
	public Entities addEntity(@RequestBody Entities entity) {
		return service.saveEntity(entity);
	}

}
