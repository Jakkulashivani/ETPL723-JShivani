package com.evergent.corejava.Strings;

public class RemoveSpace {
      public static void main(String[] args) {
		String str="Hello World,this is a test";
		String noSpaces=str.replace(" ","");
		System.out.println(noSpaces);
	}
}
