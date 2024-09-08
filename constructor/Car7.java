package com.evergent.corejava.constructor;

public class Car7 {
	String color;
	int maxSpeed;
	Car7()
	{
		color="White";
		maxSpeed=120;
	}
	Car7(String color,int maxSpeed)
	{
		this.color=color;
		this.maxSpeed=maxSpeed;
	}
	void display()
	{
		System.out.println("color:"+color);
		System.out.println("maxSpeed:"+maxSpeed);
	}
	public static void main(String[] args) {
		Car7 c1=new Car7();
		Car7 c2=new Car7("red",150);
		c1.display();
		c2.display();
	}

}
