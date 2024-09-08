package com.evergent.corejava.exceptionhandling;

public class ExceptionDemo6 {
	String name="null";
	int k=2;
	public void myData()
	{
		try {
		System.out.println("one");
		System.out.println(name.length());
		System.out.println(10/k);
		System.out.println("end..");
		}
		
		finally {
			System.out.println("finally block....");
		}
	}
	public static void main(String[] args) {
		ExceptionDemo6 emp=new ExceptionDemo6();
		emp.myData();
	}

}
