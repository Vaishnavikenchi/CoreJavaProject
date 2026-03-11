package com.student;

public class Student {
	
	//Variables stores student information
	int id;
	String name;
	int age;
	
	//Constructor automatically runs when an object is created
	public Student(int id,String name,int age){
		this.id=id;
		this.name=name;
		this.age=age;
	}
	
	public void display() {
		System.out.println("ID:"+id);
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("-----------------");
	}

}
