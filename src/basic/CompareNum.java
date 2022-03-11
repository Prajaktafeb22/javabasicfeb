package basic;
import java.util.Scanner;

public class CompareNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three numbers:");
		int comp1=sc.nextInt();
		int comp2=sc.nextInt();
		int comp3=sc.nextInt();
		
		if(comp1>=comp2 && comp1>=comp3) {
			System.out.println("Biggest number is :" +comp1);
			
		}
		else if(comp2>=comp1 && comp2>=comp3) {
			System.out.println("Biggest number is :"+comp2);
		}
		else
			System.out.println("Biggest number is :" +comp3);
		
		sc.close();
		System.out.println();
	}
	
	

}
