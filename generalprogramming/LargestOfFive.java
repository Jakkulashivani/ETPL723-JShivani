package com.evergent.corejava.generalprogramming;

public class LargestOfFive {
   public static void main(String[] args) {
	int a=10;
	int b=20;
	int c=30;
	int d=5;
	int e=15;
	if(a>b&&a>c&&a>d&&a>e)
	{
		System.out.println("a is largest...");
	}
	else if(b>c&&b>d&&b>e)
	{
		System.out.println("b is largest...");
	}
	else if(c>d&&c>e)
	{
		System.out.println("c is largest...");
	}
	else if(d>e)
	{
		System.out.println("d is largest...");
	}
	else
	{
		System.out.println("e is largest...");
	}
}
}
