package com.jdk8;

public class Student {
	
	int id;
	String name;
	
	Student(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	void display() {
		System.out.println(id+" "+name);
	}

	public static void main(String[] args) {
		Student s1 =  new Student(111, "Rohit");
		Student s2 =  new Student(222, "Kumar");
		
		s1.display();
		s2.display();

	}

}
