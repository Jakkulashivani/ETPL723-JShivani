package com.evergent.corejava.exceptionhandling;

public class CommandLineArguments {
      public static void main(String[] args) {
    	  try {
		System.out.println(args[4]);
    	  }
    	  catch(ArrayIndexOutOfBoundsException e)
    	  {
    		  System.out.println("no such index argument");
    	  }
	}
}
