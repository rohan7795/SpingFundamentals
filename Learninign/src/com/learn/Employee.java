package com.learn;

import java.util.Comparator;

public class Employee implements Comparable<Employee>{

	
	int id;
	String name;

	public Employee(int i, String string) {
		id = i;
		name = string;
	}

	
	@Override
	public String toString() {
	
		return " "+this.name+" ";
	}

	


	@Override
	public int compareTo(Employee o) {
		String a = this.name;
		String b = o.name;
		return a.compareTo(b);
	}
	
}
