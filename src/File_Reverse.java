import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class File_Reverse {

	public static void main(String[] args) {
		
		 File fl=new File("C:\\Users\\DECOMM\\Downloads\\Demo.test");
		ArrayList<String> filelines=new ArrayList<String>();
		 try {
			Scanner sc=new Scanner(fl);

		while(sc.hasNextLine()) {
			
			filelines.add(sc.nextLine());
			
		}
		sc.close();
		
		for(int i=0;i< filelines.size();i++)
		{
			System.out.println(filelines.get(filelines.size() -1-i));
		}	
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		 
		
		
		

	}

}
