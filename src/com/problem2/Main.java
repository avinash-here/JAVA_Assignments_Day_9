package com.problem2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number between 1 to 10");
		int num = sc.nextInt();
		
		if(num > 10 || num < 1) {
			System.out.println("Invalid Number!");
		}
		else {
			Parent p1 = new Child(num);
			//p1.number = num;
			p1.method1();
			p1.method2();
			p1.method3();
			Child c1 = (Child)p1;
			c1.method4();
		}

	}

}
