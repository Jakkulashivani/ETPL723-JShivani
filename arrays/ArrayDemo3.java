package com.evergent.corejava.arrays;

public class ArrayDemo3 {
	public static void main(String[] args) {
		int arr[]=new int[5];
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=i;
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
