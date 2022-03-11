package basic;

import java.util.Scanner;

public class BankingSystem {

	int passwd;int amt=0;
	static Scanner obj;

	BankingSystem()
	{
		obj = new Scanner(System.in);
	}

	public void  deposite(){

		System.out.println("Enter your Password ");
		passwd=obj.nextInt();
		if(passwd==123) {
			System.out.println("Enter your amount ");
			int depositamt=obj.nextInt();
			amt=amt+depositamt;
			System.out.println("Total amount is :"+amt);
			System.out.println("Total deposited amount is :"+depositamt);

		}
		else {
			System.out.println("Incorrect Password ");
		}

	}

	public void  withdraw(){

		System.out.println("Enter your Password ");
		passwd=obj.nextInt();
		if(passwd==123) {

			System.out.println("Enter your amount ");
			int withdrawmoney=obj.nextInt();
			amt=amt-withdrawmoney;
			System.out.println("Total amount is :"+amt);
			System.out.println("Withdrawn amount is :"+withdrawmoney);

		}
		else {
			System.out.println("Incorrect Password ");
		}


	}

	public void  balcheck(){


		System.out.println("Enter your Password ");
		passwd=obj.nextInt();
		if(passwd==123) {
			System.out.println("Total amount is :"+amt);

		}
		else {
			System.out.println("Incorrect Password ");
		}

	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch=0;
		BankingSystem bnk=new BankingSystem();

		

		while(ch!=4)
		{
			System.out.println("1.Deposite :");
			System.out.println("2.Withdraw :");
			System.out.println("3.Balance Check :");


			System.out.println("Enter your choice ");


			ch=obj.nextInt();




			switch(ch) {
			case 1:bnk.deposite();
			break;
			case 2:bnk.withdraw();
			break;
			case 3:bnk.balcheck();
			break;
			default:System.out.println("Invaild    Choice ");


			}
		}
		
		
		obj.close();
	}

}
