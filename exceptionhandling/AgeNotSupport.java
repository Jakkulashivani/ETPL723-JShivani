package com.evergent.corejava.exceptionhandling;
class AgeNotSupportException extends Exception{
	public AgeNotSupportException(String message)
	{   //System.out.println("hello! "+message);
		//we have call the super exception class constructor other wise we don't use e.getmessage().
		super(message);
	}}
public class AgeNotSupport {
	public static void mydata(int age) throws AgeNotSupportException{
		if(age<18)
		{
			throw new AgeNotSupportException("Age must be 18 or older");
		}
		else
		{
			System.out.println("eligible for vote...");
		}
	}
	public static void main(String[] args) {
		try {
			mydata(17);
		}
		catch(AgeNotSupportException e) {
			System.out.println("caught the exception:"+ e.getMessage());
			System.out.println(e);
		}
		System.out.println("program continues after handling the exception");
	}
	

}
