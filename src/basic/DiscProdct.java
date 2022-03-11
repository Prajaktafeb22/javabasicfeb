package basic;
import java.util.Scanner;

public class DiscProdct {

	public static void main(String[] args) {
		Scanner amt= new Scanner(System.in);
		System.out.print("Enter your total shopping amount : ");
		double price=amt.nextDouble();
		double a =0;
		if(price>=1000 && price<=2999) {
			
			a= (price*10)/100;
			a=price-a;
			System.out.println("Enter your total shopping amount : "+a);
			
		}
		
		else if(price>=3000 && price<=4999) {
			
			a= (price*15)/100;
			a=price-a;
			System.out.println("Enter your total shopping amount : "+a);
			
		}
		else if(price>=5000 && price<=6999) {
			
			a= (price*20)/100;
			a=price-a;
			System.out.println("Enter your total shopping amount : "+a);
			
		}
		else if(price<=10000) {
			
			a= (price*25)/100;
			a=price-a;
			System.out.println("Enter your total shopping amount : "+a);
			
		}
		
		else 
			System.out.println();
			
		amt.close();
		

	}

}
