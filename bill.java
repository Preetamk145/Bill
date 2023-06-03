package BillingProject;

import java.util.Scanner;

public class bill {
	public static void main(String[] args)
	{
		int x;
		Scanner s =new Scanner(System.in);
		while(true)
		{
		System.out.println("Choose \n 1.NewBill 2.Close");
		x=s.nextInt();
		if(x==1) {
		int noofpeople,noofdays,ch;
		String type="";
		
		System.out.println("***** Welcome to Breeze Blows resort *****");
		System.out.println("Choose one \n 1.Standard 2.Deluxe 3.Cottage");
		ch=s.nextInt();
		if(ch==1)
			type="STANDARD";
		else if(ch==2)
			type="DELUX";
		else if(ch==3)
			type="COTTAGE";
		else
			System.out.println("Invalid Input");
		System.out.println("Enter how many days of stay(<=15)");
		noofdays=s.nextInt();
		System.out.println("Enter how many people extra (0-2)");
		noofpeople=s.nextInt();
		AutoBill b=new AutoBill(noofpeople,noofdays,type);
		System.out.println("Bill no "+b.billNumber());
		System.out.println("Amount :"+b.calculateBill());
		}
		else
			break;
		}
		System.exit(0);
	}
}
