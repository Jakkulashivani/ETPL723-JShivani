package com.evergent.corejava.constructor;

public class Employee5 {
	int eno;
	String ename;
	double sal;
	public  Employee5()
	{
		System.out.println("default constructor...");
	}
	public Employee5(int eno)
	{
		this.eno=eno;
	}
	public Employee5(int eno,String ename,double sal)
	{
		this(eno);
		this.ename=ename;
		this.sal=sal;
	}
	public void display()
	{
		System.out.println("employee no.:"+eno);
		System.out.println("employee name.:"+ename);
		System.out.println("employee sal:"+sal);
	}
	 public static void main(String[] args) {
		Employee5 emp1=new Employee5();
		Employee5 emp2=new Employee5(123,"Shiva",60000);
		emp1.display();
		emp2.display();
		
		
	}

}

