package com.learning.spring.springjavaconfig.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class Dao {

	public void create() {
		System.out.println("Created Record");
	}

}
