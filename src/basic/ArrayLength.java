package basic;
import java.util.Scanner;

public class ArrayLength {

	public static void main(String[] args) {
		/*int str[]= {10,20,30,40,50};
		System.out.print("The length of string is : ");
		System.out.println(str.length);*/
		
		Scanner length=new Scanner(System.in);
		System.out.print("The length of string is : ");
		int sz=length.nextInt();
		int size[]= new int [sz];
		System.out.println("Enter your array : ");
		for(int i=0;i<sz;i++) {
			size[i]=length.nextInt();
			size[i]++;
			
			
		}
		
	length.close();
		
		
		
		
	}

}
