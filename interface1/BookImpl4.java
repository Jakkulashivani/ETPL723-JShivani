package com.evergent.corejava.interface1;

public class BookImpl4 implements Book,NewBook {
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
	public void myNewBook()
	{
		System.out.println("this is my new book...");
	}
	public void dataInfo()
	{
		System.out.println("this is my information...");
	}
	public void show()
	{
		System.out.println("local method of impl1 class");
	}
	public static void main(String[] args) {
		BookImpl4 book1=new BookImpl4();
		book1.bookTittle();
		book1.bookAuthor();
		book1.bookPrice();
		book1.myNewBook();
		book1.dataInfo();
		book1.show();
	}

}
