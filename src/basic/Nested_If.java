package basic;

import java.util.Scanner;

public class Nested_If {

	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in);
	    System.out.println("Enter your numbers: ");
		int num1=obj.nextInt();
		int num2=obj.nextInt();
		int num3=obj.nextInt();
		obj.close();
		
		if(num1>num2) {
			if (num1>num3) {
				
				System.out.println("Bigger number is : "+num1);
			}
			else 
		 System.out.println("Bigger number is: "+num3);
			
		}
		else {
			if (num2>num3) {
		    
				
				System.out.println("Bigger number is : "+num2);
			}
			else 
		 System.out.println("Bigger number is: "+num3);
		}
	}

	}
