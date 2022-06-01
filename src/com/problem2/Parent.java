package com.problem2;

public class Parent {
	
	void method1() {};
	
	final void method2() {
		System.out.println("Inside method2 of Parent");
	}
	
	void method3() {
		System.out.println("Inside method3 of Parent");
	}
	
	final int number;		
	
	public Parent(int num) {
		number = num;
	}	
		
	

}
