package com.evergent.corejava.abstraction;

public class ProductImpl3 extends Product3{
	public ProductImpl3()
	{
		super("Shivani");
		System.out.println("productimpl3 sub class constructor");
	}
	
	public void newProduct()
	{
		System.out.println("my new product..");
	}
	public void show()
	{
		System.out.println("local method");
	}
	public static void main(String[] args) {
		Product3 p1=new ProductImpl3();
		p1.newProduct();
		p1.allProducts();
		
	}

}
