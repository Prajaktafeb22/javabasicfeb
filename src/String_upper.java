import java.util.Scanner;

public class String_upper {

	public static void main(String[] args) {
		
		System.out.println("Enter your string in lowercase :");
		
		Scanner inputscanner=new Scanner(System.in);
		String inputstring=inputscanner.nextLine();
		inputstring = inputstring.toUpperCase();
		System.out.println("String after convert to upper case  " +inputstring);
		inputstring = inputstring.toLowerCase();
		System.out.println("String after convert to lower case  " +inputstring);
		inputscanner.close();
	}

	

}
