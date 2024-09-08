package com.evergent.corejava.generalprogramming;

public class Pattern7 {
	public static void main(String[] args) {
		int k=1;
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=k;j++)
			{
				System.out.print("*");
			}
			if(k<4)
			{
				k++;
			}
			else
			{
				k--;
			}
			System.out.println();
		}
	}

}
