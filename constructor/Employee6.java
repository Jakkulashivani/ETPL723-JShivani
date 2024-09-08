package com.evergent.corejava.constructor;

class MyEmployee
{
	int eno;
	public MyEmployee()
	{	
	}
	public MyEmployee(int eno) {
		System.out.println("My employee no.:"+eno);
	}
}
public class Employee6 extends MyEmployee{
	String name;
	double sal;
	Employee6()
	{
		System.out.println("default constructor..");
	}
	Employee6(int eno,String name,double sal)
	{
		super(eno);
		this.eno=eno;
		this.name=name;
		this.sal=sal;
	}
	public void display()
	{
		System.out.println("employee no.:"+eno);
		System.out.println("employee name.:"+name);
		System.out.println("employee sal:"+sal);
	}
	 public static void main(String[] args) {
		Employee6 emp1=new Employee6();
		Employee6 emp2=new Employee6(123,"Shiva",60000);
		emp1.display();
		emp2.display();
	 }

}
