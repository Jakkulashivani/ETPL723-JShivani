package com.evergent.corejava.finalprograms;

final class MyClass1{
	final public void myProducts()
	{
		System.out.println("AI products..");
	}
}
//The type FinalDemo3 cannot subclass the final class MyClass1
public class FinalDemo3  {
	
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
		FinalDemo3 fd1=new FinalDemo3();
		fd1.myData();
		MyClass1 m1=new MyClass1();
		m1.myProducts();
		
		
	}
	
}


