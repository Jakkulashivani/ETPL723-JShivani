package com.evergent.corejava.arrays;

public class DdArray5 {
	public static void main(String[] args) {
		int arr[][]=new int[5][5];
		int k=1;
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr.length-1;j++)
			{
				arr[i][j]=k;
				k++;
					
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
