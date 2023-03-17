import java.util.Scanner;

public class Int_To_String {

	public static void main(String[] args) {
		
		System.out.println("Enter your Integer  : ");
		Scanner inputscanner=new Scanner(System.in);
		Integer inputInt=inputscanner.nextInt();
		
		String parsedint=inputInt.toString();
		
		System.out.println("You input String  "+ inputInt);
		System.out.println("Parsed Integer  "+ parsedint);
		inputscanner.close();
	}

}
