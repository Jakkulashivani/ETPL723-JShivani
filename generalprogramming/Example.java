package com.evergent.corejava.generalprogramming;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name:");
		String name=sc.next();
		System.out.println("Enter the a value:");
		int a=sc.nextInt();
		System.out.println("Enter the b value:");
		int b=sc.nextInt();
		System.out.println("name: "+name);
		System.out.println("sum of a and b: "+(a+b));
		
		
	}

}
