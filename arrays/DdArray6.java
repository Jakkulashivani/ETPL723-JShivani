package com.evergent.corejava.arrays;

public class DdArray6 {
	public static void main(String[] args) {
		String arr[][]=new String[5][5];
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr.length-1;j++)
			{
				arr[i][j]="java";
			}
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(" ");
			for(int j=0;j<=arr.length-1;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
		}
	}

}
