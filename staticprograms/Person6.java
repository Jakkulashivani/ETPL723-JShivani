package com.evergent.corejava.staticprograms;
//if we modify static variable it reflected  globally
public class Person6 {
	static String name="shiva";
	int age=22;
	String address="Hyderabad";
	int a=10;
	public void display()
	{
		name="welcome";
		a=20;
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Address:"+address);
		System.out.println(a);
	}
	public static void main(String[] args) {
		Person6 p1=new Person6();
		//System.out.println(name);
		p1.display();
		//System.out.println(name);
		Person6 p2=new Person6();
		System.out.println(name);
		System.out.println(p2.a);
		
	}

}
