package com.evergent.corejava.oops;

public class MethodFlow {
	//No Arguments with No return type
	public void display()
	{
		System.out.println("No Arguments with No return type");
	}
	// Arguments with no return type
	public void addition(int a,int b)
	{
		System.out.println("Addition of a and b is: "+(a+b));
	}
	// Arguments with return type
	public int myData(int a,int b)
	{
	    return (a*b);
	}
	// No Arguments with return type
	public int myChange()
	{
		 return 100;
	}
	public static void main(String[] args) {
		MethodFlow mf=new MethodFlow();
		mf.display();
		mf.addition(5, 8);
		System.out.println(mf.myData(7, 9));
		System.out.println(mf.myChange());
	}

}
