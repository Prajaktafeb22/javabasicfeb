import java.util.Scanner;

public class String_To_Int {

	public static void main(String[] args) {
		System.out.println("Enter your string  : ");
		Scanner inputscanner=new Scanner(System.in);
		String inputstring=inputscanner.next();
		
		int parsedint=Integer.parseInt(inputstring);
		System.out.println("You input String  "+ inputstring);
		System.out.println("Parsed Integer  "+ parsedint);
		
		inputscanner.close();
	}

}
