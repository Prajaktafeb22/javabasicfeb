package selfstudy;

import java.io.File;
import java.util.Scanner;

public class Read_From_file {

	public static void main(String[] args) {
		try {
			File file=new File("C:\\Users\\DECOMM\\Downloads\\Demo.test");
			
			Scanner obj=new Scanner(file);
			while(obj.hasNextLine()) {
				System.out.println(obj.nextLine());
				
			}
			
			obj.close();
			
		}
catch(Exception e) {
	
	System.out.println("Error");
	e.printStackTrace();
	
}
	}

}
