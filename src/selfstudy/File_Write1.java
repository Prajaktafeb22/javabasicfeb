package selfstudy;

import java.io.*;


public class File_Write1 {

	public static void main(String[] args) {

		try {

			FileWriter myWriter=new FileWriter("C:\\Users\\DECOMM\\Downloads\\Demo.test");

			//myWriter.write("I can write");
			myWriter.append("\nMy new line");	
			myWriter.close();
			System.out.println("Writing Succesfully");
		}

		catch (IOException e) {

			System.out.println("An error occured");
			e.printStackTrace();

		}

	}

}
