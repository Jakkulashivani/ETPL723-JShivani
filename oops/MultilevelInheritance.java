package com.evergent.corejava.oops;

class PersonalData{
	public void myPersonData()
	{
		System.out.println("person data class method");
	}
}
class PersonInfo extends PersonalData
{
	public void myDeatails()
	{
		System.out.println("personInfo class method...");
	}
}
public class MultilevelInheritance extends PersonInfo{
	public void show()
	{
		System.out.println("local method");
	}
	public static void main(String[] args) {
		MultilevelInheritance mi=new MultilevelInheritance();
		mi.show();
		mi.myPersonData();
		mi.myDeatails();
	}

}
