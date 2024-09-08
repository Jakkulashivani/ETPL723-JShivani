package com.evergent.corejava.task3;
import java.util.*;

import com.evergent.corejava.task.task2.Book;
public class EmployeeImpl implements EmployeeInterface {
	List <Employee> list=new ArrayList<Employee>();
	public String employeeAdd(Employee e)
	{
		list.add(e);
		return e.getEmpId()+" "+e.getEmpName()+" "+e.getEmpAdd()+" is added";
	}
	public void searchById(int empId) {
		boolean b=false;
		if(list.size()>0||list!=null)
		{
			for(Employee e:list) {
				if(e.getEmpId()==empId){
					System.out.println(e.getEmpId()+" "+e.getEmpName()+" "+e.getEmpAdd());	
					b=true;
					break;
				}
			}
		}
		if(!b){
			System.out.println("employee is not found..");
		}
	}
	public void displayAll() {
		if(list.size()>0){
			for(Employee e:list){
				System.out.println(e.getEmpId()+" "+e.getEmpName()+" "+e.getEmpAdd());
			}
				
		}else{
			System.out.println("No employees are added...");
		}
		
	}

}
