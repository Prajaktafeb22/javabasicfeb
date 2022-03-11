package basic;
import java.util.Scanner;

public class SalaryHomeWork {

	public static void main(String[] args) {
		Scanner per =new Scanner(System.in);
		System.out.print("Enter your experience : ");
		int exp =per.nextInt();
		System.out.print("Enter Your salary  : " );
		int sal=per.nextInt();
		float newsal =0;
		if(exp>= 3 && exp <=5 ){		
			
			newsal=(float)sal*1.1f;
			System.out.print(" Your salary  : " +newsal);
		}
		else if (exp>=6 && exp<= 9)
			{
			newsal=(float)sal*1.15f;
			System.out.print(" Your salary  : " +newsal);
			}
			else if (exp>=10 && exp<=20)
			{
				newsal=(float)sal*1.20f;
				System.out.print(" Your salary  : "+newsal );
			}
			else {
				
			}
		
		
		
		per.close();
		
	}

}
