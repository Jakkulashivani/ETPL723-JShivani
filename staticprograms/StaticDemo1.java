package com.evergent.corejava.staticprograms;

public class StaticDemo1 {
    static String cname="India";
    static public void myData()
    {
    	System.out.println("static method:myData");
    }
    public static void main(String[] args) {
		System.out.println(cname);
		myData();
	}
}
