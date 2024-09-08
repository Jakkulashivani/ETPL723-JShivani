package com.evergent.corejava.oops;

public class UserLogin {
	public void loginData()
	{
		System.out.println("Login Info");
	}
	public void loginData(String name,String pass)
	{
		System.out.println("Name: "+name);
		System.out.println("pass: "+pass);
	}
	public void loginData(String name,String pass,String captcha)
	{
		System.out.println("Name: "+name);
		System.out.println("pass: "+pass);
	}

	public void loginData(int mobile,String pass)
	{
		System.out.println("Mobile: "+mobile);
		System.out.println("pass: "+pass);
	}
	public void show()
	{
		System.out.println("show method..");
	}
	public static void main(String[] args) {
		UserLogin login=new UserLogin();
		login.loginData();
		login.loginData("shivani", "Shivani@123");
		login.loginData("priya", "priya@123", "abf");
		login.loginData(1234567, "@12345dt");
		login.show();
	}

}
