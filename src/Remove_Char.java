import java.util.Scanner;

public class Remove_Char {

	public static void main(String[] args) {
		
		
       System.out.println("Enter your string :");
		
		Scanner inputscanner=new Scanner(System.in);
		
		String inputstring=inputscanner.nextLine();
		System.out.println("Enter your char to be replaced :");
		String replaceString=inputscanner.next();
		String replaceword = inputstring.replaceAll(replaceString, "");
		System.out.println("Replaced word is :"+replaceword );
		
		 
       inputscanner.close();

	}

}
