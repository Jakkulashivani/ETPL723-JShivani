package com.evergent.corejava.abstraction;

public class ProductImpl extends Product{
	public void newProduct()
	{
		System.out.println("my new product..");
	}
	public void show()
	{
		System.out.println("local method of ProductImpl");
	}
	public static void main(String[] args) {
		ProductImpl p1=new ProductImpl();
		p1.show();
		p1.allProduct();
		p1.newProduct();
	}

}
