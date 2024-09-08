package com.evergent.java.jdbc.crudOperation;
import java.util.*;
public class ApplicationOfJDBC {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ImplementationClassOfAJDBC i=new ImplementationClassOfAJDBC();
		ApplicationBean ab=new ApplicationBean();
		int empId;
		String empName;
		double sal;
		System.out.println("enter your choice....");
		System.out.println("1.insert");
		System.out.println("2.update");
		System.out.println("3.read");
		System.out.println("4.delete");
		System.out.println("5.exit");
		int value=sc.nextInt();
		switch(value) {
		case 1:
			System.out.println("enter the employee id:");
			empId=sc.nextInt();
			ab.setEmpId(empId);
			System.out.println("enter employee name:");
			empName=sc.next();
			ab.setEmpName(empName);
			System.out.println("enter emp salary:");
			sal=sc.nextDouble();
			ab.setSal(sal);
			int b=i.insert(ab);
			if(b==1)
				System.out.println("inserted successfully...");
			else
				System.out.println("insertion not successfull...");
			break;
		case 2:
			System.out.println("enter the employee id:");
		    empId=sc.nextInt();
			ab.setEmpId(empId);
			System.out.println("enter employee name:");
			empName=sc.next();
			ab.setEmpName(empName);
			System.out.println("enter emp salary:");
			sal=sc.nextDouble();
			ab.setSal(sal);
			int u=i.update(ab);
			if(u==1)
				System.out.println("updated successfully....");
			else
				System.out.println("not updated successfully....");
			break;
		case 3:
			i.read();
			break;
		case 4:
			System.out.println("Enter Employee ID for Delete Record: ");
			empId=sc.nextInt();
			ab.setEmpId(empId);
			int d=i.delete(ab);
			if(d==1)
				System.out.println("delete succefully...");
			else
				System.out.println("not deletee...");
			break;
		case 5:
			i.exit();
			break;
		}
		
	}

}
