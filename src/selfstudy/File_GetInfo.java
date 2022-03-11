package selfstudy;

import java.io.*;

public class File_GetInfo {

	public static void main(String[] args) {
		File file=new File("C:\\Users\\DECOMM\\Downloads\\Demo.test");
		if(file.exists()) {
			
	        System.out.println("File Exits and File Name is :"+file.getName());
			System.out.println("File readable or not :"+file.canRead());
			System.out.println("File writable or not :"+file.canWrite());
			System.out.println("Filesize in byte :"+file.length());
			
			
			
		}
		else
			System.out.println("No file available");
	}

}
