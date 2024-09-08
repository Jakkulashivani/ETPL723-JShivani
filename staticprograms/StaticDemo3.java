package com.evergent.corejava.staticprograms;

public class StaticDemo3 {
	static String cname="India";
	String name="shiva";
	static public void myData()
	{
		System.out.println("my data..");
		//myShow(); static method can't access non static method
	}
	public void myShow()
	{
		System.out.println("my show");
	}
	public static void main(String[] args) {
		//name;         Cannot make a static reference to the non-static field name
		myData();
	}

}
