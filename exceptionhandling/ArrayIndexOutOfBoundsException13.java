package com.evergent.corejava.exceptionhandling;

public class ArrayIndexOutOfBoundsException13 {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		try {
			System.out.println(arr[10]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
