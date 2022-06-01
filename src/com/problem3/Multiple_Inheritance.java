package com.problem3;

public class Multiple_Inheritance {
	
	/*
	 * Why is multiple inheritance not supported in Java at class level?
	 * 
	 * In Java, multiple inheritance is not supported, because it may confuse the JVM.
	 * let's go through an example.
	 * Below there are two classes "Hi" and "Hello"
	 * Both have a method called 'fun1';
	 * Now, if an other class like "HiHello" extends both the classes.
	 * And then, we call 'fun1' method from the object of "HiHello" class
	 * In this case, JVM will confuse, whether it has to execute 'fun1' of "Hi" or of "Hello"
	 * 
	 * It will leave JVM in an ambiguous state, That's why multiple inheritance is not 
	 * supported in Java. 
	 * 
	 */

}

class Hi{
	void fun1() {
		System.out.println("Hi");
	}
}

class Hello{
	void fun1() {
		System.out.println("Hello");
	}
}

class HiHello extends Hi/*, Hello */{
	
}

