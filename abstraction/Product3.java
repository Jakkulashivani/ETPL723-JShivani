package com.evergent.corejava.abstraction;

abstract public class Product3 {
	String cname;
	public Product3(String cname)
	{
		this.cname=cname;
		System.out.println("called aash");
	}
	
	abstract public void newProduct();
	public void allProducts()
	{
		System.out.println("All products.."+cname);
	}
	

}
