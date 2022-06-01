package com.problem2;

final public class Child extends Parent{
	
	public Child(int num) {
		super(num);
	}
	
	void method4() {
		System.out.println("Inside method4 of Child");		
	}

	@Override
	void method1() {
		System.out.println("Inside method1 of Child");	
		System.out.println("Number you entered : "+ this.number);
	}
	

}
