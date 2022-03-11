package homework;

import java.io.*;

public class Read_Write_Access {

	public static void main(String[] args) {
		File fl=new File("C:\\Users\\DECOMM\\Downloads\\Demo.test"); 
		
		if(fl.canRead()) {
			
			System.out.println("File is readable ");
		}
		else 
			System.out.println("File is not readable");
		
		if(fl.canWrite()) {
			
			System.out.println("File is Writable ");
		}
		else 
			System.out.println("File is not writable");
	}

	}
	


