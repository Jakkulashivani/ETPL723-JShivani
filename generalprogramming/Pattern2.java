package com.evergent.corejava.generalprogramming;

public class Pattern2 {
	public static void main(String[] args) {
		int k=25;
		for(int i=1;i<=5;i++)
		{
			System.out.println(" ");
			for(int j=1;j<=5;j++)
			{
				System.out.print(" "+k);
				k--;
			}
		}
	}

}
