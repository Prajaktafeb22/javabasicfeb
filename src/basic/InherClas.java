package basic;

import java.util.Scanner;

class bank{
	 private int paswd;
	 double bal=0;
	 
	 
	 public void Deposite() {
		 System.out.println("Enter password :");
		 Scanner sc= new Scanner (System.in);
		 if(sc.hasNextLine())
			 sc.nextLine();
		 paswd=sc.nextInt();
		 if(sc.hasNextLine())
			 sc.nextLine();
		 if(paswd==156) {
			 System.out.println("Deposite Money :");			 
			 double depositedmoney=sc.nextDouble();
			 bal=bal+depositedmoney;
			 System.out.println("Deposite Money :"+depositedmoney);
			 System.out.println("Total balance :"+bal);
			 
		 }
		 else {
			 System.out.println("Incorrect Password :");
		 }	
		 sc.close();
	 }
	
	 public void Withdraw() {
		 System.out.println("Enter password :");
		 Scanner sc= new Scanner (System.in);
		 sc.nextLine();
		 paswd=sc.nextInt();
		 sc.nextLine();
		 if(paswd==123) {
			 double withdrawmoney =sc.nextDouble();
			 bal=bal-withdrawmoney;
			 
			 System.out.println("Withdrawn Money :"+withdrawmoney);
			 System.out.println("Total balance :"+bal);
			 
		 }
		 else {
			 System.out.println("Incorrect Password :");
		 }
		 sc.close();
}	 
	
		 public void CheckBal() {
			 System.out.println("Enter password :");
			 Scanner sc= new Scanner (System.in);
			 sc.nextLine();
			 paswd=sc.nextInt();
			 sc.nextLine();
			 if(paswd==123) {
				 
				 System.out.println("Total balance :"+bal);
				 
			 }
			 else {
				 System.out.println("Incorrect Password :");
			 }	 
			 sc.close();

		 }
}

public class InherClas {

	public static void main(String[] args) {
		
		bank b=new bank();
		int ch=-1;
		
		System.out.println("Welcome to Bank Of America's platform :");
		Scanner obj =new Scanner(System.in);
		while(ch!=4)
		{
			
			System.out.println("Please choose a option :");
			System.out.println("1.Deposite:");
			System.out.println("2.Withdraw:");
			System.out.println("3.Check Balance:");
			System.out.println("4.Exit:");
			
			//Checking for correct options
			System.out.println("Enter your choice :");
			
			if(obj.hasNextInt())
			{
				ch=obj.nextInt();
				obj.nextLine(); 
			}
			
			
		
			
			switch(ch) {
			case 1:b.Deposite();
			break;
			case 2:b.Withdraw();
			break;
			case 3:b.CheckBal();
			break;
			case 4:break;
			default: System.out.println("Invalid Choice :");
			
				
			}
		}
		
		obj.close();
		
	}

}
