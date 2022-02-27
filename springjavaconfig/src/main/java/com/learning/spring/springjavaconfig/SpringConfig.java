package com.learning.spring.springjavaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.learning.spring.springjavaconfig.dao.Dao;
import com.learning.spring.springjavaconfig.service.Service;

@Configuration
public class SpringConfig {

	@Bean
	public Dao dao() {
		return new Dao();
	}

	@Bean
	public Service service() {
		return new Service();
	}

}
