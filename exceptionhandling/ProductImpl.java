package com.evergent.corejava.exceptionhandling;

class ProductNotFoundexception extends Exception{
	public ProductNotFoundexception(String message)
	{
		System.out.println("hello"+message);
	}
}
public class ProductImpl {
	int pno=105;
	public void mydata() throws ProductNotFoundexception{
		if(pno>100)
		{
			throw new ProductNotFoundexception("there is no products");
		}
		else
		{
			System.out.println("product are there..");
		}
	}
	public static void main(String[] args) {
		try {
			ProductImpl p1=new ProductImpl();
			p1.mydata();
		}
		catch(ProductNotFoundexception e) {
			System.err.print(e);
		}
	}
	

}
