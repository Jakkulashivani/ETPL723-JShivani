package com.evergent.corejava.Strings;

public class StringBuilderExample {
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("Hello");
		System.out.println("initial String:"+sb);
		//append a string
		sb.append(" world!");
		System.out.println("After append: "+sb);
		//Insert a string at a specific position
		sb.insert(6, "beautiful");
		System.out.println("After insert:"+sb);
		//replace a substring
		sb.replace(0, 4, "hi");
		System.out.println("After replace:"+sb);
		//delete a substring
		sb.delete(0, 3);
		System.out.println("After delete:"+sb);
		//reverse the string 
		sb.reverse();
		System.out.println("after reverse :"+sb);
	}

}
