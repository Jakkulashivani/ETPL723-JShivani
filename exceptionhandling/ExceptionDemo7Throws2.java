package com.evergent.corejava.exceptionhandling;


public class ExceptionDemo7Throws2 {
	String name=null;
	int k=2;
	public void myData() throws NullPointerException{
		System.out.println("One");
		System.out.println(10/k);
		System.out.println("end");
	}
	public void myChange() throws NullPointerException
	{
		System.out.println("myChange method...");
		System.out.println(name.length());
		myData();
		
	
	
	}
	public static void main(String[] args)
	{
			try {
				ExceptionDemo7Throws2 ed=new ExceptionDemo7Throws2();
				ed.myChange();
			}
			catch(Exception e)
			{
				System.out.println("i can handle:"+e);
			}
	}
	
	
	}


