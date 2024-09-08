package com.evergent.corejava.exceptionhandling;

public class StackOverFlowErrorExample extends Exception {
	public static void main(String[] args) {
		try {
			recursivemethod();
		}
		catch(StackOverflowError e) {
			System.out.println("stack over flow error caught:"+e.getMessage());
			
		}
	}
	public static void recursivemethod()
	{
		recursivemethod();
	}

}
