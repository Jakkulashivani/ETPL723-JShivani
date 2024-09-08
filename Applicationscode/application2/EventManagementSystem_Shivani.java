package com.evergent.corejava.shivani.application2;
import java.io.IOException;
import java.util.Scanner;
public class EventManagementSystem_Shivani {
	enum module{O,S,P,E};
	enum submodule1{WOMEN,MEN,KIDS};
	enum submodule2{CHAT,CALL,GMAIL};
	enum submodule3{INVOICE,SUMMARY,PAYMENT};
	enum submodule1_1{KURTHIS,SAREES,TUNICS};
	enum submodule1_2{JEANS,SHIRTS,TSHIRTS};
	enum submodule1_3{FROCKS,SKIRTS,TRADITION};
	static int itemcost;
	static int pieces;
	static int value;
	static double amount;
	static double payAmount;
	public static void main(String[] args) throws IOException{
		String mod=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("*********Welcome To Fashion World**********");
		while(true)
		{
			System.out.println("***********************");
			System.out.println("<<<<<<SALES>>>>");
			System.out.println("***********************");
			System.out.println("plz select your choice from below.....");
			System.out.println("**********************");
			System.out.println("O- Order module");
			System.out.println("S- Services");
			System.out.println("P- Payment");
			System.out.println("E- Exit");
			System.out.println("**********************");
			System.out.println("Enter the chioce (O,S,P,E):");
			mod=sc.nextLine();
			switch(module.valueOf(mod))
			{
			case O:
				System.out.println("****order module******");
				System.out.println("plz select the choice from below...");
				System.out.println("**********************");
				System.out.println("WOMEN- Women Section");
				System.out.println("MEN  - Men Section");
				System.out.println("KIDS - Kids Section");
				System.out.println("**********************");
				System.out.println("Enter the chioce (WOMEN,MEN,KIDS):");
				mod=sc.nextLine();
				switch(submodule1.valueOf(mod))
				{
				case WOMEN:
					System.out.println("******selected Women section*****");
					System.out.println("plz select the choice from below...");
					System.out.println("**********************");
					System.out.println("KURTHIS \t 1.Straight Cut Kurti \t\t\t RS 850.00 \n \t\t 2.Anarkali Kurti \t\t\t RS 800.00 \n\t\t 3.Shirt Collar Kurti \t\t\t RS 750.00 \n\t\t 4.A-Line Kurti \t\t\t RS 800.00 \n\t\t 5.Aliacut Kurthi \t\t\t RS 800.00   ");
					System.out.println();
					System.out.println("SAREES  \t 1.Kanjivaram Silk Saree \t\t RS 1000.00 \n \t\t 2.Banarasi Saree \t\t\t RS 1200.00 \n\t\t 3.Chikankari Saree \t\t\t RS 1400.00 \n\t\t 4.Bandhani Saree \t\t\t RS 1300.00 \n\t\t 5.Nauvari Saree  \t\t\t RS 1000.00 ");
					System.out.println();
					System.out.println("TUNICS  \t 1.Long-sleeve tunics  \t\t\t RS 500.00 \n \t\t 2.Short-sleeve tunics \t\t\t RS 450.00 \n\t\t 3.Sleeveless tunics \t\t\t RS 300.00 \n\t\t 4.Asymmetrical hem tunics \t\t RS 300.00  ");
					System.out.println("**********************");
					System.out.println("Enter the chioce (KURTHIS,SAREES,TUNICS):");
					mod=sc.nextLine();
					switch(submodule1_1.valueOf(mod))
					{
					case KURTHIS:
						System.out.println("Enter the chioce (1,2,3,4,5):");
						value =Integer.parseInt( sc.nextLine());
						switch(value)
						{
						case 1:
							itemcost=850;
						break;
						case 2:
							itemcost=800;
						break;
						case 3:
							itemcost=750;
						break;
						case 4:
							itemcost=800;
						break;
						case 5:
							itemcost=800;
						break;
						}
						break;
					case SAREES:
						System.out.println("Enter the chioce (1,2,3,4,5):");
						value =Integer.parseInt( sc.nextLine());
						switch(value)
						{
						case 1:
							itemcost=1000;
						break;
						case 2:
							itemcost=1200;
						break;
						case 3:
							itemcost=1400;
						break;
						case 4:
							itemcost=1300;
						break;
						case 5:
							itemcost=1000;
						break;
						}
						break;
					case TUNICS:
						System.out.println("Enter the chioce (1,2,3,4):");
						value =Integer.parseInt( sc.nextLine());
						switch(value)
						{
						case 1:
							itemcost=500;
						break;
						case 2:
							itemcost=450;
						break;
						case 3:
							itemcost=300;
						break;
						case 4:
							itemcost=300;
						break;
						}
						break;
					}
					break;
				case MEN:
					System.out.println("******selected Women section*****");
					System.out.println("plz select the choice from below...");
					System.out.println("**********************");
					System.out.println("JEANS   \t 1.Slim fit jeans \t\t\t RS 1500.00 \n \t\t 2.Skinny jeans \t\t\t RS 1800.00 \n\t\t 3.Bootcut jeans \t\t\t RS 2000.00 \n\t\t 4.Loose fit jeans \t\t\t RS 1550.00 \n\t\t 5.Tapered Jeans   \t\t\t RS 1500.00");
					System.out.println();
					System.out.println("SHIRTS  \t 1.Linen Shirt \t\t\t\t RS 900.00 \n \t\t 2.Cuban Collar Shirt \t\t\t RS 1200.00 \n\t\t 3.Henley Shirt \t\t\t RS 1300.00 \n\t\t 4.Flannel Shirt \t\t\t RS 950.00 \n\t\t 5.Polo shirt    \t\t\t RS 960.00");
					System.out.println();
					System.out.println("TSHIRTS \t 1.Hooded T-Shirts \t\t\t RS 500.00 \n \t\t 2.V-Neck T-Shirts \t\t\t RS 450.00 \n\t\t 3.Striped T-Shirts \t\t\t RS 300.00 \n\t\t 4.Solid T-Shirts \t\t\t RS 300.00 \n\t\t 5.Henley T-Shirts  \t\t\t RS 480.00");
					System.out.println("**********************");
					System.out.println("Enter the chioce (JEANS,SHIRTS,TSHIRTS):");
					mod=sc.nextLine();
					switch(submodule1_2.valueOf(mod))
					{
					case JEANS:
						System.out.println("Enter the chioce (1,2,3,4,5):");
						value =Integer.parseInt( sc.nextLine());
						switch(value)
						{
						case 1:
							itemcost=1500;
						break;
						case 2:
							itemcost=1800;
						break;
						case 3:
							itemcost=2000;
						break;
						case 4:
							itemcost=1550;
						break;
						case 5:
							itemcost=1500;
						break;
						}
						break;
					case SHIRTS:
						System.out.println("Enter the chioce (1,2,3,4,5):");
						value =Integer.parseInt( sc.nextLine());
						switch(value)
						{
						case 1:
							itemcost=900;
						break;
						case 2:
							itemcost=1200;
						break;
						case 3:
							itemcost=1300;
						break;
						case 4:
							itemcost=950;
						break;
						case 5:
							itemcost=950;
						break;
						}
						break;
					case TSHIRTS:
						System.out.println("Enter the chioce (1,2,3,4,5):");
						value =Integer.parseInt( sc.nextLine());
						switch(value)
						{
						case 1:
							itemcost=500;
						break;
						case 2:
							itemcost=450;
						break;
						case 3:
							itemcost=300;
						break;
						case 4:
							itemcost=300;
						break;
						case 5:
							itemcost=480;
						break;
						}
						break;
					}
					break;
				case KIDS:
					System.out.println("******selected Women section*****");
					System.out.println("plz select the choice from below...");
					System.out.println("**********************");
					System.out.println("FROCKS   \t 1.cotton frock \t\t\t RS 1000.00 \n \t\t 2.short frock \t\t\t RS 1200.00 \n\t\t 3.Long frock         \t\t\t RS 1600.00");
					System.out.println();
					System.out.println("SKIRTS   \t 1.Miniskirt \t\t\t RS 700.00 \n \t\t 2.Basic skirt \t\t\t RS 800.00 \n\t\t 3.Asymmetrical skirt \t\t\t RS 1200.00 ");
					System.out.println();
					System.out.println("TRADITION   \t 1.Croptops \t\t\t RS 1900.00 \n \t\t 2.Lehanga \t\t\t RS 2000.00 \n\t\t 3.HalfSaree         \t\t\t RS 2500.00");
					System.out.println("**********************");
					System.out.println("Enter the chioce (FROCKS,SKIRTS,TRADITION):");
					mod=sc.nextLine();
					switch(submodule1_3.valueOf(mod))
					{
					case FROCKS:
						System.out.println("Enter the chioce (1,2,3):");
						value =Integer.parseInt( sc.nextLine());
						switch(value)
						{
						case 1:
							itemcost=1000;
						break;
						case 2:
							itemcost=1200;
						break;
						case 3:
							itemcost=1600;
						break;
						}
						break;
					case SKIRTS:
						System.out.println("Enter the chioce (1,2,3):");
						value =Integer.parseInt( sc.nextLine());
						switch(value)
						{
						case 1:
							itemcost=700;
						break;
						case 2:
							itemcost=800;
						break;
						case 3:
							itemcost=1200;
						break;
						}
						break;
					case TRADITION:
						System.out.println("Enter the chioce (1,2,3):");
						value =Integer.parseInt( sc.nextLine());
						switch(value)
						{
						case 1:
							itemcost=1900;
						break;
						case 2:
							itemcost=2000;
						break;
						case 3:
							itemcost=2500;
						break;
						}
						break;
					}
					
					break;
				}
				System.out.println("Enter the number of pieces:");
				pieces =Integer.parseInt( sc.nextLine());
				System.out.println("you selected no of PIECES are "+pieces);
				amount=itemcost*pieces;
				if(amount>=500&&amount<=1000)
				{
					payAmount=amount-(amount*0.02);
				}
				else if(amount>1000&&amount<=2000)
				{
					payAmount=amount-(amount*0.04);
				}
				else if(amount>2000&&amount<=3000)
				{
					payAmount=amount-(amount*0.06);
				}
				else if(amount>3000&&amount<=4000)
				{
					payAmount=amount-(amount*0.08);
				}
				else
				{
					payAmount=amount-(amount*0.1);
				}
				System.out.println("Total Amount to be Paid : Rs"+amount);
				System.out.println("To Make Payment : Rs"+payAmount);
				break;
			case S:
				System.out.println("****Help Center module******");
				System.out.println("plz select the choice from below...");
				System.out.println("**********************");
				System.out.println("CHAT- for chat");
				System.out.println("CALL- for Customer Call");
				System.out.println("GMAIL- for Mail");
				System.out.println("**********************");
				System.out.println("Enter the chioce (CHAT,CALL,GMAIL):");
				mod=sc.nextLine();
				switch(submodule2.valueOf(mod))
				{
				case CHAT:
					System.out.println("Contact us WhatsApp:1800-889-9991 ");
					break;
				case CALL:
					System.out.println("Contact us Helpline:1800-889-9991 ");
					break;
				case GMAIL:
					System.out.println("Contact us Mail Address:customercare@ajio.com");
					break;
				
				}
				break;
			case P:
				System.out.println(" Payment Module");
				System.out.println("******************************");
				System.out.println("INVOICE-to dispaly invoice for order");
				System.out.println("SUMMARY-to display the summary of orders and payments made");
				System.out.println("PAYMENT-to make payment");
				System.out.println("******************************");
				System.out.println("Enter your Module code (INVOICE,SUMMARY,PAYMENT) : ");
				mod=sc.nextLine();
				switch(submodule3.valueOf(mod))
				{
				case INVOICE:
					System.out.println("Invoice Display");
					System.out.println("**************************");
					System.out.println("Ordered Id : " +(Math.ceil(Math.random())));
					System.out.println("you selected no of pieces are "+pieces);
					System.out.println("To Make Payment : Rs"+payAmount);
					break;
				case SUMMARY:
					System.out.println("Summary Of Order");
					System.out.println("*****************************");
					System.out.println("you selected  item cost Rs:"+amount);
					System.out.println("you selected no. of pieces are:"+pieces);
					System.out.println("Amount for order after Discount for selected pieces is Rs:"+payAmount);
					System.out.println("\n");
					System.out.println("Total Amount to be Paid :Rs"+amount);
					System.out.println("To Make Payment :Rs"+payAmount);
					break;	
				case PAYMENT:
					System.out.println("To Make Payment:Rs "+payAmount);
					break;
				}
				break;
			case E:
				System.out.println("Quit Module");
				System.exit(0);
				break;
			}
			
		}
	}
}
