package aarushPracticeForFun;
import java.util.Scanner;
public class If_Else_Aarush {
public static void main(String[] args) {
	
	
	             aarushPractice();		
		 
			    // Scanner input = firstProgram();

			    // input.close();
			   }





private static Scanner firstProgram() {
	char operator;
	 Double number1, number2, result;

	 Scanner input = new Scanner(System.in);

	 
	 System.out.println("Choose an operation: +, -, *, or /");
	 operator = input.next().charAt(0);

	
	 System.out.println("Enter first number");
	 number1 = input.nextDouble();

	 System.out.println("Enter second number");
	 number2 = input.nextDouble();

	 switch (operator) {

	 
	 case '+':
	     result = number1 + number2;
	     System.out.println(number1 + " + " + number2 + " = " + result);
	     break;


	   case '-':
	     result = number1 - number2;
	     System.out.println(number1 + " - " + number2 + " = " + result);
	     break;

	  
	   case '*':
	     result = number1 * number2;
	     System.out.println(number1 + " * " + number2 + " = " + result);
	     break;

   
	   case '/':
	     result = number1 / number2;
	     System.out.println(number1 + " / " + number2 + " = " + result);
	     break;

	   default:
	     System.out.println("Invalid operation!");
	     break;
	 }
	return input;
}
	 
	
	
	
	
	public static void aarushPractice() {
		
		char operator;
	    Double number1, number2, result;
	    System.out.println("Choose an operation: +,-,x,/ ");
		Scanner input = new Scanner(System.in);
	    operator = input.next().charAt(0);
	    System.out.println("Enter first number");
	    number1 = input.nextDouble();
	    System.out.println("Enter second number");
	    number2 = input.nextDouble();
	    switch (operator) {   
	    case '+':
	    result = number1 + number2;
	    System.out.println(number1 + " + " + number2 + " = " + result);
	    break;
	    case '-':
	    result = number1 - number2;
	    System.out.println(number1 + " - " + number2 + " = " + result);
	    break;
	    
	    
	    
	    }
	
	
	
	}


	}



