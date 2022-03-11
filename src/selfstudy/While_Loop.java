package selfstudy;

import java.util.Scanner;

public class While_Loop {

	public static void main(String[] args) {
		
		
		System.out.println("Enter your number");
		Scanner obj =new Scanner(System.in);
		int num1=obj.nextInt();
		System.out.println("your number is :"+num1); 

		while(num1%2==0) {
			
			
			
			System.out.println("Number is even ");
			
			
			
		}
		
	
		System.out.println("Number is odd ");
		
	
		
		
		
		obj.close();

	}

}
