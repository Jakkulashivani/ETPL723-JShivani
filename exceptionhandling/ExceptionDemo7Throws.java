package com.evergent.corejava.exceptionhandling;


public class ExceptionDemo7Throws {
	String name=null;
	int k=2;
	public void myData() throws NullPointerException{
		System.out.println("One");
		System.out.println(name.length());
		System.out.println(10/k);
		System.out.println("end");
	}
	public static void main(String[] args)
	{
			try {
				ExceptionDemo7Throws ed=new ExceptionDemo7Throws();
				ed.myData();
			}
			catch(Exception e)
			{
				System.out.println("i can handle:"+e);
			}
	}
	
	
	}


