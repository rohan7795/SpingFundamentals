package com.learn;

public class ClassB extends ClassA {

	public static void main(String[] args) {
		
		ClassA a = new ClassB();
		
	//	Auto
		
		ClassB b = new ClassB();
		//old
		
		ClassA c = b;
		
		//typecast
		
		// ecast karte
		ClassC d = (ClassC) c;
		//
		
		ClassC v = (ClassC) new ClassA();
		
	}

	void method2() {
		System.out.println("in 2 of b");
	}

}
