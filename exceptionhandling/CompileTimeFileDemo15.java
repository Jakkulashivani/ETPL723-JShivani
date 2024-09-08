package com.evergent.corejava.exceptionhandling;
import java.io.*;
import java.util.Scanner;
public class CompileTimeFileDemo15 {
	public static void main(String[] args) {
		try {
			File file=new File("C:/mydata/myinfo.txt");
			Scanner sc=new Scanner(file);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
