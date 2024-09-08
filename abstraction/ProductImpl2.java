package com.evergent.corejava.abstraction;

public class ProductImpl2 extends Product{
	public void newProduct()
	{
		System.out.println("my new product...");
	}
	public void show()
	{
		System.out.println("local method ");
	}
	public static void main(String[] args) {
		Product p1=new ProductImpl2();
		p1.newProduct();
		p1.allProduct();
	}
	

}
