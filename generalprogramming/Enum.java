package com.evergent.corejava.generalprogramming;

	enum color{
		RED,GREEN,BLUE;
	}
	enum news{
		NORTH,EAST,WEST,SOUTH;
	}
	enum Abcproducts{
		LAPTOP,DESKTOP,TABS;
	}
	enum Days{
		MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;
	}
	public class Enum{
		public static void main(String[] args) {
			color c=color.RED;
			System.out.println(c);
			news s=news.NORTH;
			System.out.println(s);
			Abcproducts p=Abcproducts.LAPTOP;
			System.out.println(p);
			Days d=Days.SUNDAY;
			System.out.println("Holiday: "+d);
		}
	}

