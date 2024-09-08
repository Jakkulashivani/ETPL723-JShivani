package com.evergent.corejava.shivani.application4;

public class Services {
	 private final String contactNumber;
	 private final String emailAddress;
	 
	 //constructor
	 public Services(String contactNumber,String emailAddress)
	 {
		 this.contactNumber=contactNumber;
		 this.emailAddress=emailAddress;
	 }
	 static {
	        System.out.println("*Help Center module***");
	    }

	    public void chat() {
	        System.out.println("Contact us WhatsApp: "+contactNumber);
	    }

	    public void call() {
	        System.out.println("Contact us Helpline: "+contactNumber);
	    }

	    public void mail() {
	        System.out.println("Contact us Mail Address: "+emailAddress);
	    }

	    public void exit() {
	        System.out.println("Quit Module");
	        System.exit(0);
	    }
}
