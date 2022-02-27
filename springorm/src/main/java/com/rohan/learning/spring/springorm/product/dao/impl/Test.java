package com.rohan.learning.spring.springorm.product.dao.impl;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rohan.learning.spring.springorm.product.dao.ProductDao;
import com.rohan.learning.spring.springorm.product.entity.Product;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		ProductDao bean = (ProductDao)ctx.getBean("productDao");
		
		Product product = new Product();
		
		product.setId(4);
		product.setName("samsung");
		product.setDesc("best");
		product.setPrice(190);
		bean.create(product);
		//bean.update(product);
		//bean.delete(product);
		//Product find = bean.find(3);
		
		//List<Product> findAll = bean.findAll();
		//System.out.println(findAll);
	}

}
