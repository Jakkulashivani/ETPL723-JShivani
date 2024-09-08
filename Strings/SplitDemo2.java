package com.evergent.corejava.Strings;

public class SplitDemo2 {
	public static void main(String[] args) {
		String str="Java is a powerful programming language";
		String[] words=str.split(" ");
		for(String s:words)
		{
			System.out.println(s);
		}
	}

}
