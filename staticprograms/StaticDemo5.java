package com.evergent.corejava.staticprograms;

public class StaticDemo5 {
	static
	{
		System.out.println("static block:open db/network connection");
	}
	static String cname="India";
	static public void myData()
	{
		System.out.println("my data");
	}
	public static void main(String[] args) {
		System.out.println(StaticDemo5.cname);
		StaticDemo5.myData();
	}

}
