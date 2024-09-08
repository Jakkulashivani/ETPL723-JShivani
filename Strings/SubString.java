package com.evergent.corejava.Strings;

public class SubString {
	public static void main(String[] args) {
		String str="the Quick brown fox jumps over the lazy dog";
		String subStr="fox";
		boolean contains=str.contains(subStr);
		System.out.println("contains '"+subStr+"':"+contains);
	}

}
