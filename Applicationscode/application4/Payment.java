package com.evergent.corejava.shivani.application4;

public abstract class Payment {
	 protected int pieces;
	    protected double amount;
	    protected double payAmount;
	    protected static int itemCost;
	    
	    
	    //Constructor
	    public Payment(int itemCost)
	    {
	    	Payment.itemCost=itemCost;
	    }

	    public abstract void invoice();
	    public abstract void summary();

	    public void payment() {
	        System.out.println("To Make Payment: Rs " + payAmount);
	    }
}
