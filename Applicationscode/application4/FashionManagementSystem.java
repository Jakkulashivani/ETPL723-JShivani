package com.evergent.corejava.shivani.application4;
import java.util.Scanner;
public class FashionManagementSystem extends Payment implements Order 
{
	
     private final Scanner sc;
     private final Services services;//Has-a relationship with Services class
     //constructor
     public FashionManagementSystem(int itemCost,Services services) {
    	 super(itemCost);
    	 this.sc=new Scanner(System.in);
    	 this.services=services;
    	 
     }

    public static void main(String[] args) {
    	Services services =new Services("1800-889-9991","customercare@ajio.com");
    	FashionManagementSystem fms = new FashionManagementSystem(0,services);
        fms.run();
    }

    public void run() {
        while (true) {
            System.out.println("****Welcome To Fashion World***");
            System.out.println("*********");
            System.out.println("<<<<<<SALES>>>>");
            System.out.println("*********");
            System.out.println("O- Order module");
            System.out.println("S- Services");
            System.out.println("P- Payment");
            System.out.println("E- Exit");
            System.out.println("********");
            System.out.println("Enter the choice (O,S,P,E):");
            String mod = sc.nextLine();

            switch (mod.toUpperCase()) {
                case "O":
                    orderModule();
                    break;
                case "S":
                    servicesModule();
                    break;
                case "P":
                    payment();
                    break;
                case "E":
                    services.exit();
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    private void orderModule() {
        System.out.println("*Order module***");
        System.out.println("WOMEN- Women Section");
        System.out.println("MEN  - Men Section");
        System.out.println("KIDS - Kids Section");
        System.out.println("Enter the choice (WOMEN,MEN,KIDS):");
        String mod = sc.nextLine();

        switch (mod.toUpperCase()) {
            case "WOMEN":
                women();
                break;
            case "MEN":
                men();
                break;
            case "KIDS":
                kids();
                break;
            default:
                System.out.println("Invalid choice! Please try again.");
        }
    }

    @Override
    public void women() {
        System.out.println("***Selected Women section**");
        System.out.println("plz select the choice from below...");
		System.out.println("**********************");
		System.out.println("KURTHIS \t 1.Straight Cut Kurti \t\t\t RS 850.00 \n \t\t 2.Anarkali Kurti \t\t\t RS 800.00 \n\t\t 3.Shirt Collar Kurti \t\t\t RS 750.00 \n\t\t 4.A-Line Kurti \t\t\t RS 800.00 \n\t\t 5.Aliacut Kurthi \t\t\t RS 800.00   ");
		System.out.println();
		System.out.println("SAREES  \t 1.Kanjivaram Silk Saree \t\t RS 1000.00 \n \t\t 2.Banarasi Saree \t\t\t RS 1200.00 \n\t\t 3.Chikankari Saree \t\t\t RS 1400.00 \n\t\t 4.Bandhani Saree \t\t\t RS 1300.00 \n\t\t 5.Nauvari Saree  \t\t\t RS 1000.00 ");
		System.out.println();
		System.out.println("TUNICS  \t 1.Long-sleeve tunics  \t\t\t RS 500.00 \n \t\t 2.Short-sleeve tunics \t\t\t RS 450.00 \n\t\t 3.Sleeveless tunics \t\t\t RS 300.00 \n\t\t 4.Asymmetrical hem tunics \t\t RS 300.00  ");
		System.out.println("**********************");
		System.out.println("Enter the chioce (KURTHIS,SAREES,TUNICS):");
		String mod=sc.nextLine();
		switch(mod.toUpperCase())
		{
		case "KURTHIS":
			System.out.println("Enter the chioce (1,2,3,4,5):");
			int value =Integer.parseInt( sc.nextLine());
			switch(value)
			{
			case 1:
				itemCost=850;
			break;
			case 2:
				itemCost=800;
			break;
			case 3:
				itemCost=750;
			break;
			case 4:
				itemCost=800;
			break;
			case 5:
				itemCost=800;
			break;
			}
			break;
		case "SAREES":
			System.out.println("Enter the chioce (1,2,3,4,5):");
			value =Integer.parseInt( sc.nextLine());
			switch(value)
			{
			case 1:
				itemCost=1000;
			break;
			case 2:
				itemCost=1200;
			break;
			case 3:
				itemCost=1400;
			break;
			case 4:
				itemCost=1300;
			break;
			case 5:
				itemCost=1000;
			break;
			}
			break;
		case "TUNICS":
			System.out.println("Enter the chioce (1,2,3,4):");
			value =Integer.parseInt( sc.nextLine());
			switch(value)
			{
			case 1:
				itemCost=500;
			break;
			case 2:
				itemCost=450;
			break;
			case 3:
				itemCost=300;
			break;
			case 4:
				itemCost=300;
			break;
			}
		}
		calculateAmount();
    }

    @Override
    public void men() {
        System.out.println("***Selected Men section**");
        System.out.println("plz select the choice from below...");
		System.out.println("**********************");
		System.out.println("JEANS   \t 1.Slim fit jeans \t\t\t RS 1500.00 \n \t\t 2.Skinny jeans \t\t\t RS 1800.00 \n\t\t 3.Bootcut jeans \t\t\t RS 2000.00 \n\t\t 4.Loose fit jeans \t\t\t RS 1550.00 \n\t\t 5.Tapered Jeans   \t\t\t RS 1500.00");
		System.out.println();
		System.out.println("SHIRTS  \t 1.Linen Shirt \t\t\t\t RS 900.00 \n \t\t 2.Cuban Collar Shirt \t\t\t RS 1200.00 \n\t\t 3.Henley Shirt \t\t\t RS 1300.00 \n\t\t 4.Flannel Shirt \t\t\t RS 950.00 \n\t\t 5.Polo shirt    \t\t\t RS 960.00");
		System.out.println();
		System.out.println("TSHIRTS \t 1.Hooded T-Shirts \t\t\t RS 500.00 \n \t\t 2.V-Neck T-Shirts \t\t\t RS 450.00 \n\t\t 3.Striped T-Shirts \t\t\t RS 300.00 \n\t\t 4.Solid T-Shirts \t\t\t RS 300.00 \n\t\t 5.Henley T-Shirts  \t\t\t RS 480.00");
		System.out.println("**********************");
		System.out.println("Enter the chioce (JEANS,SHIRTS,TSHIRTS):");
		String mod=sc.nextLine();
		switch(mod)
		{
		case "JEANS":
			System.out.println("Enter the chioce (1,2,3,4,5):");
			int value =Integer.parseInt( sc.nextLine());
			switch(value)
			{
			case 1:
				itemCost=1500;
			break;
			case 2:
				itemCost=1800;
			break;
			case 3:
				itemCost=2000;
			break;
			case 4:
				itemCost=1550;
			break;
			case 5:
				itemCost=1500;
			break;
			}
			break;
		case "SHIRTS":
			System.out.println("Enter the chioce (1,2,3,4,5):");
			value =Integer.parseInt( sc.nextLine());
			switch(value)
			{
			case 1:
				itemCost=900;
			break;
			case 2:
				itemCost=1200;
			break;
			case 3:
				itemCost=1300;
			break;
			case 4:
				itemCost=950;
			break;
			case 5:
				itemCost=950;
			break;
			}
			break;
		case "TSHIRTS":
			System.out.println("Enter the chioce (1,2,3,4,5):");
			value =Integer.parseInt( sc.nextLine());
			switch(value)
			{
			case 1:
				itemCost=500;
			break;
			case 2:
				itemCost=450;
			break;
			case 3:
				itemCost=300;
			break;
			case 4:
				itemCost=300;
			break;
			case 5:
				itemCost=480;
			break;
			}
			break;
		}
        calculateAmount();
    }

    @Override
    public void kids() {
        System.out.println("***Selected Kids section**");
        System.out.println("plz select the choice from below...");
		System.out.println("**********************");
		System.out.println("FROCKS   \t 1.cotton frock \t\t\t RS 1000.00 \n \t\t 2.short frock \t\t\t RS 1200.00 \n\t\t 3.Long frock         \t\t\t RS 1600.00");
		System.out.println();
		System.out.println("SKIRTS   \t 1.Miniskirt \t\t\t RS 700.00 \n \t\t 2.Basic skirt \t\t\t RS 800.00 \n\t\t 3.Asymmetrical skirt \t\t\t RS 1200.00 ");
		System.out.println();
		System.out.println("TRADITION   \t 1.Croptops \t\t\t RS 1900.00 \n \t\t 2.Lehanga \t\t\t RS 2000.00 \n\t\t 3.HalfSaree         \t\t\t RS 2500.00");
		System.out.println("**********************");
		System.out.println("Enter the chioce (FROCKS,SKIRTS,TRADITION):");
		String mod=sc.nextLine();
		switch(mod)
		{
		case "FROCKS":
			System.out.println("Enter the chioce (1,2,3):");
			int value =Integer.parseInt( sc.nextLine());
			switch(value)
			{
			case 1:
				itemCost=1000;
			break;
			case 2:
				itemCost=1200;
			break;
			case 3:
				itemCost=1600;
			break;
			}
			break;
		case "SKIRTS":
			System.out.println("Enter the chioce (1,2,3):");
			value =Integer.parseInt( sc.nextLine());
			switch(value)
			{
			case 1:
				itemCost=700;
			break;
			case 2:
				itemCost=800;
			break;
			case 3:
				itemCost=1200;
			break;
			}
			break;
		case "TRADITION":
			System.out.println("Enter the chioce (1,2,3):");
			value =Integer.parseInt( sc.nextLine());
			switch(value)
			{
			case 1:
				itemCost=1900;
			break;
			case 2:
				itemCost=2000;
			break;
			case 3:
				itemCost=2500;
			break;
			}
			break;
		}
		
        calculateAmount();
    }

    private void calculateAmount() {
        System.out.println("Enter the number of pieces:");
        pieces = Integer.parseInt(sc.nextLine());
        amount = itemCost * pieces;
        payAmount = calculateDiscount(amount);
        System.out.println("Total Amount to be Paid: Rs " + amount);
        System.out.println("To Make Payment: Rs " + payAmount);
    }

    private double calculateDiscount(double amount) {
        if (amount >= 500 && amount <= 1000) {
            return amount - (amount * 0.02);
        } else if (amount > 1000 && amount <= 2000) {
            return amount - (amount * 0.04);
        } else if (amount > 2000 && amount <= 3000) {
            return amount - (amount * 0.06);
        } else if (amount > 3000 && amount <= 4000) {
            return amount - (amount * 0.08);
        } else {
            return amount - (amount * 0.1);
        }
    }

    private void servicesModule() {
        System.out.println("CHAT- for chat");
        System.out.println("CALL- for Customer Call");
        System.out.println("GMAIL- for Mail");
        System.out.println("Enter the choice (CHAT,CALL,GMAIL):");
        String mod = sc.nextLine();

        switch (mod.toUpperCase()) {
            case "CHAT":
                services.chat();
                break;
            case "CALL":
                services.call();
                break;
            case "GMAIL":
                services.mail();
                break;
            default:
                System.out.println("Invalid choice! Please try again.");
        }
    }

    @Override
    public void invoice() {
        System.out.println("Invoice Display");
        System.out.println("Ordered Id : " + (Math.ceil(Math.random())));
        System.out.println("You selected no of pieces are " + pieces);
        System.out.println("To Make Payment : Rs " + payAmount);
    }

    @Override
    public void summary() {
        System.out.println("Summary Of Order");
        System.out.println("Item cost: Rs " + amount);
        System.out.println("No. of pieces: " + pieces);
        System.out.println("Amount after Discount: Rs " + payAmount);
        System.out.println("Total Amount to be Paid : Rs " + amount);
    }
}
