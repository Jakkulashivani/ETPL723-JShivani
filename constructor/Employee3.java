package com.evergent.corejava.constructor;

public class Employee3 {
	int eno;
	String ename;
	double sal;
	public  Employee3()
	{
		System.out.println("default constructor...");
	}
	public Employee3(int eno,String ename,double sal)
	{
		this.eno=eno;
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
		Employee3 emp1=new Employee3();
		Employee3 emp2=new Employee3(123,"Shiva",60000);
		emp1.display();
		emp2.display();
		
		
	}

}

