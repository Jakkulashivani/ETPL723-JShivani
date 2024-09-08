package com.evergent.corejava.application;
import java.lang.Exception;
import java.util.Scanner;
public class AdultUser implements LibraryUser{
	int age;
	String booktype;
	Scanner sc=new Scanner(System.in);
	public void registerAccount(int age)
	{
		
		  if(age>12) {
			   System.out.println("You have successfully registered under an Adult Account");
		    }
		   else {
			   System.out.println("Sorry, Age must be greater than 12 to register as an adult");
		   }
	
	}
	public void requestBook(String booktype)
	{
		if(booktype.equalsIgnoreCase("fiction"))
		{
			System.out.println("Book Issued successfully, please return the book within 7 days");
		}
		else {
			try {
				throw new LibraryAgeException("Book not valid Exception");
			}
			catch(LibraryAgeException e) {
			System.out.println("Oops, you are allowed to take only fiction  books");
			System.out.println("enter booktype:");
			booktype=sc.next();
			if(booktype.equalsIgnoreCase("fiction"))
			{
				System.out.println("Book Issued successfully, please return the book within 7 days");
			}
			else {
				System.out.println("oops! you entered other than fiction...");
			}
			}
		}
	
	}

}
