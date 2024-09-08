package com.evergent.corejava.task3;
import java.util.*;
@SuppressWarnings("unused")
public class EmployeeMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EmployeeInterface EI=new EmployeeImpl();
		while(true) {
		System.out.println("1.Add Employee 2.Search by id 3.Display Employee list 4.exit");
		int no=sc.nextInt();
		switch(no)
		{
			case 1:
				System.out.println("enter employee id:");
				int empId=sc.nextInt();
				System.out.println("enter employee name:");
				String empName=sc.next();
				System.out.println("enter employee add:");
				String empAdd=sc.next();
				Employee e=new Employee();
				e.setEmpId(empId);
				e.setEmpName(empName);
				e.setEmpAdd(empAdd);
				String message=EI.employeeAdd(e);
				System.out.println(message);
				break;
			case 2:
				System.out.println("enter employee id:");
			    empId=sc.nextInt();
			    EI.searchById(empId);
			    break;
			case 3:
				EI.displayAll();
				break;
			case 4:
				System.exit(0);
				break;
		}
		}
		
		
	}

}
