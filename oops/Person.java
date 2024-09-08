package com.evergent.corejava.oops;

public class Person {
	String name="Shivani";
	int age=22;
	String address="Nirmal";
	public void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Address: "+address);
	}
	public static void main(String[] args) {
		Person p=new Person();
		p.display();
	}

}
