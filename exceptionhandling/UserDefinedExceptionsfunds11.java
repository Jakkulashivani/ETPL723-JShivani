package com.evergent.corejava.exceptionhandling;
class InSufficientFundsException extends Exception{
	public InSufficientFundsException(String message)
	{
		super(message);
	}
}
public class UserDefinedExceptionsfunds11 {
          public static void withDraw(double amount) throws InSufficientFundsException
          {
        	  double balance=500;
        	  if(amount>balance)
        	  {
        		  throw new InSufficientFundsException("insufficient funds for withdraw");
        	  }
        	  else {
        		  System.out.println("withdraw successful");
        	  }
          }
          public static void main(String[] args) {
			try {
				withDraw(600);
				}
			catch(InSufficientFundsException e) {
				System.out.println("caught exception: "+e.getMessage());
				System.out.println(e);
			}
		}
}
