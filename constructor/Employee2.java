package com.evergent.corejava.constructor;

public class Employee2 {
	int eno;
	String ename;
	double sal;
	public  Employee2()
	{
		System.out.println("default constructor...");
	}
	public Employee2(int eno1,String ename1,double sal1)
	{
		eno=eno1;
		ename=ename1;
		sal=sal1;
	}
	public void display()
	{
		System.out.println("employee no.:"+eno);
		System.out.println("employee name.:"+ename);
		System.out.println("employee sal:"+sal);
	}
	 public static void main(String[] args) {
		Employee2 emp1=new Employee2();
		Employee2 emp2=new Employee2(123,"Shiva",60000);
		emp1.display();
		emp2.display();
		
		
	}

}
