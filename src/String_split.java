import java.util.Scanner;

public class String_split {

	public static void main(String[] args) {
		
		System.out.println("Enter your string :");
		
		Scanner inputscanner=new Scanner(System.in);
		
		String inputstring=inputscanner.nextLine();
		
		
		String[] words = inputstring.split(" ");
		
		for(int i=0;i<words.length;i++) {
			System.out.println(words[words.length-1-i]);
			
			
		}
       inputscanner.close();
	}

}
