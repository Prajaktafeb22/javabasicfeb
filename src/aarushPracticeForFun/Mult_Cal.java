package aarushPracticeForFun;

import java.util.Scanner;

public class Mult_Cal {

	public static void main(String[] args) {
		
		

		int a,b;
		System.out.println("Enter number 1 :");
		Scanner inputcalculater=new Scanner(System.in);
		
		a=inputcalculater.nextInt();
		
		System.out.println("Enter number 2 :");
		b=inputcalculater.nextInt();
		inputcalculater.close();
		int result=a*b;	
			
			System.out.println("Your result is "+result);
		}

	
	}


