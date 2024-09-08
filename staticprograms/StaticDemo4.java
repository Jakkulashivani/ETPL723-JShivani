package com.evergent.corejava.staticprograms;

public class StaticDemo4 {
     static String cName="India";
     String name="Shiva";
     static public void myData()
     {
    	 System.out.println("my data:"+cName);
     }
     public void myShow()
     {
    	 myData();
    	 System.out.println(cName);
     }
     public static void main(String[] args) {
		myData();
		System.out.println(cName);
		StaticDemo4 s4=new StaticDemo4();
		s4.myShow();
	}
     
}
