package com.evergent.corejava.oops;

public class HAS_A_RelationShip {
	public void show()
	{
		System.out.println("show method");
	}
	public static void main(String[] args) {
		HAS_A_RelationShip has=new HAS_A_RelationShip();
		has.show();
		//HAS_A
		Person p=new Person();
		p.display();
	}

}
