package com.evergent.corejava.objectclassmethods;

class Person{
	String name;
	int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String toString()
	{
		return "name: "+name+" age: "+age;
	}
	
}
public class MyPerson {
	public static void main(String[] args) {
		Person p=new Person("shiva",22);
		System.out.println(p);
		System.out.println(p.hashCode());
	}

}
