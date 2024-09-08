package com.evergent.corejava.finalprograms;

public class FinalDemo1 {
	final String cname="India";
	public void myData()
	{
		//cname="welcome";  final cname  cannot be reinitialized
		System.out.println(cname);
	}
	public static void main(String[] args) {
		FinalDemo1 fd1=new FinalDemo1();
		fd1.myData();
	}

}
