package com.evergent.corejava.staticprograms;

public class StaticDemo2 {
    static String cname="India";
    static public void myData()
    {
    	System.out.println("static method:myData");
    }
    public static void main(String[] args) {
		System.out.println(StaticDemo2.cname);
		StaticDemo2.myData();
	}
}
