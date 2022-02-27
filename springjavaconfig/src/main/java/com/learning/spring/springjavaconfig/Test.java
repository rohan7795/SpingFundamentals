package com.learning.spring.springjavaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learning.spring.springjavaconfig.dao.Dao;
import com.learning.spring.springjavaconfig.service.Service;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
		Service bean = ctx.getBean(Service.class);
		//Service bean2 = ctx.getBean(Service.class);
		System.out.println(bean.getDao().hashCode());
		//System.out.println(bean2.dao.hashCode());
	}
}
