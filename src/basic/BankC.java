package basic;
import java.util.*;

 class BankC {

	int passwd;int amt=0;
	
	public void  deposite(){
		Scanner obj=new Scanner(System.in);
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
		obj.close();
	}

	public void  withdraw(){
	Scanner obj=new Scanner(System.in);
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
		
	obj.close();
	}
public void  balcheck(){
	
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter your Password ");
	passwd=obj.nextInt();
	if(passwd==123) {
	System.out.println("Total amount is :"+amt);
	
	}
	else {
		System.out.println("Incorrect Password ");
	}
	obj.close();
}


	
	public static void main(String[] args) {
		int ch ;
		BankC bnk=new BankC();
		
		System.out.println("1.Deposite :");
		System.out.println("2.Withdraw :");
		System.out.println("2.Balance Check :");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your choice ");
		ch=sc.nextInt();
		
		
	   
		
		switch(ch) {
		case 1:bnk.deposite();
		break;
		case 2:bnk.withdraw();
		break;
		case 3:bnk.balcheck();
		break;
		default:System.out.println("Incorrect Choice ");
		
		
		sc.close();
		
		
		}
		
		
	}
		
	

}
