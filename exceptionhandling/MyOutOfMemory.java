package com.evergent.corejava.exceptionhandling;

public class MyOutOfMemory {
	public static void main(String[] args)throws Exception  {
		Integer[] array=new Integer[100000000*100000000];
		System.out.println(array[1000]);
	}

}
