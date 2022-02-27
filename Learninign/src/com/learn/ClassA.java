package com.learn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClassA  {
	
	public static void main(String[] args) {
		Employee e1 = new Employee(1,"rohan");
		Employee e2 = new Employee(2, "akshay");
		Employee e5 = new Employee(2, "simran");
		Employee e4 = new Employee(2, "neha");
		Employee e3 = new Employee(2, "alok");
		

		List<Employee> list = new ArrayList();
		
		list.add(e1);
		list.add(e2);
		list.add(e5);
		list.add(e4);
		list.add(e3);
		
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
	}
	

}
