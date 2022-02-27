package com.learning.spring.springjavaconfig.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.learning.spring.springjavaconfig.dao.Dao;

public class Service {

	@Autowired
	private Dao dao;

	public void save() {
		getDao().create();
	}

	public Dao getDao() {
		return dao;
	}

	public void setDao(Dao dao) {
		this.dao = dao;
	}
}
