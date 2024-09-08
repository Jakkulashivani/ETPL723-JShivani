package com.evergent.corejava.exceptionhandling;

public class ExceptionDemo5 {
	String name="null";
	int k=0;
	public void myData()
	{
		try {
		System.out.println("one");
		System.out.println(name.length());
		System.out.println(10/k);
		System.out.println("end..");
		}
		catch(NullPointerException e)
		{
			System.out.println("i can handle:"+e);
		}
		catch(ArithmeticException e)
		{
			System.out.println("i can handle:"+e);
		}
		catch(Exception e)
		{
			System.out.println("i can handle:"+e);
		}
		finally {
			System.out.println("finally block....");
		}
	}
	public static void main(String[] args) {
		ExceptionDemo5 emp=new ExceptionDemo5();
		emp.myData();
	}

}
