package com.evergent.corejava.logicalprogramming1;

public class FibonacciSeries {
	public static void main(String[] args) {
		int a=0;
		int b=1;
		int sum=0;
		for(int i=1;i<=8;i++)
		{
			System.out.print(sum+" ");
			a=b;
			b=sum;
			sum=a+b;
		}
	}

}
