/**
 * 
 */
package basic;
import java.util.Scanner;		
/**
 * @author DECOMM
 *
 */
public class Loops {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num= new Scanner(System.in);
		System.out.println("Enter your Age : ");
		
		try
		{
			int age = num.nextInt();
			num.close();
			if(age<=10) 
			{
	         System.out.println("Your number is small ");
	         
		    }
			else {
				System.out.println("Your number is not small ");
			}
		}
		catch(Exception ex)
		{
			System.out.println("You enter wrong characters ");
		}
		
		//int i=11;
		//int j=10;
		
		
		System.out.println("YOU DID IT");
	}
	}
