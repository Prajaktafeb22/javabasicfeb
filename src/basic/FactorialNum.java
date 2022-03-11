package basic;
import java.util.Scanner;

public class FactorialNum {

	public static void main(String[] args) {
	   int answer = 1;
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter your number : ");
      int fact=sc.nextInt();
      for (int i=1;i<=fact;i++) {
    	  
    	  answer=answer*i;
    	  
    	  
    	  
      }
      System.out.println("Your Factorial number is :"+answer);
      
      sc.close();
		
		
		
		
		
		
	}

}
