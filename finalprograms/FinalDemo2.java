package com.evergent.corejava.finalprograms;

class MyClass{
	final public void myProducts()
	{
		System.out.println("AI products..");
	}
}
public class FinalDemo2 extends MyClass {
	
	final String cname="India";
	/*Cannot override the final method from MyClass
	 public void myProducts()
	{
		System.out.println("AI products..");
	}*/
	public void myData()
	{
		System.out.println(cname);
	}
	public static void main(String[] args) {
		FinalDemo2 fd1=new FinalDemo2();
		fd1.myData();
	}
	
}
