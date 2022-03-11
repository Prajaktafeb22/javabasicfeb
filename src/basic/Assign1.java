package basic;

import java.util.Scanner;

public class Assign1 {

	public static void main(String[] args) {

		int result=0;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter your 2 numbers : ");


		try {

			int i=obj.nextInt();
			int j=obj.nextInt();

			result=i+j;
			System.out.println("Your sum is :"+result);

		}catch(Exception e) {

			System.out.println("Invalid Entry");
		}


		finally {

			obj.close();
		}


	}

}
