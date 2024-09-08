package com.evergent.corejava.interface1;
//we cannot create object but we can create reference
public class BookImpl1 implements Book {
	public void bookTittle()
	{
		System.out.println("book tittle...");
	}
	public void bookAuthor()
	{
		System.out.println("book author:"+name);
	}
	public void bookPrice()
	{
		System.out.println("rs 500");
	}
	public void show()
	{
		System.out.println("local method of impl1 class");
	}
	public static void main(String[] args) {
		BookImpl1 book1=new BookImpl1();
		book1.bookTittle();
		book1.bookAuthor();
		book1.bookPrice();
		book1.show();
	}

}
