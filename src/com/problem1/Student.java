package com.problem1;

import java.util.Scanner;

public class Student {
	
	private int roll;
	private String name;
	private int marks;
	private char grade;
	
	
	public Student() {		
		
	}
			
	public Student(int roll, String name, int marks, char grade) {		
		this.roll = roll;
		this.name = name;
		this.marks = marks;
		this.grade = grade;
	}



	public void displayDetails() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Student Details :");
		
		System.out.println("Name :");
		String name = sc.next();
		
		System.out.println("Roll :");
		int roll = sc.nextInt();
		
		System.out.println("Marks :");
		int marks = sc.nextInt();
		
		char grd = calculateGrade(marks);
		
		Student stud = new Student(roll,name,marks,grd);		
		
		String res = stud.toString();
		
		System.out.println();
		System.out.println(res);
		System.out.println();
		
	}
	
	private char calculateGrade(int marks) {
		if (marks >= 500)
			grade = 'A';
		if (marks < 500 && marks >= 400)
			grade = 'B';
		else
			grade = 'C';		
		return grade;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + ", grade=" + grade + "]";
	}
	
	

}
