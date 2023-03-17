package basic;

import java.util.Scanner;

public class Boolean_True_or_False {

	public static void main(String[] args) {
		
		
		System.out.println("enter boolean values (true/false):");
		
		Scanner inputboolean = new Scanner(System.in);
		System.out.println("enter first value (true/false):");		
		boolean a =inputboolean.nextBoolean();
		System.out.println("enter second value (true/false):");
		boolean b =inputboolean.nextBoolean();
		System.out.println("enter third value (true/false):");
		boolean c =inputboolean.nextBoolean();
		inputboolean.close();
		
		if((a && b) || (b && c) || ((a && c)))
			System.out.println("2 of 3 are true");
		else
			System.out.println("2 of 3 are  not true");
			
			
		
	}

}
