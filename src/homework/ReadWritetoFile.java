package homework;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadWritetoFile {

	public static void main(String[] args) {
		
		File fl=new File("C:\\Users\\DECOMM\\Downloads\\Demo.test");
		//Writing in the file
		try {
			FileWriter wrt=new FileWriter(fl);
			wrt.write("Hello,How are you?");
			System.out.println("Written succesfully");
			wrt.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			Scanner sc=new Scanner(fl);
			while(sc.hasNextLine()) {
			
				System.out.println(sc.nextLine());
				
				System.out.println("Read succesfully");
				
			}
			
			sc.close();
			
			
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		}
		
	}

}
