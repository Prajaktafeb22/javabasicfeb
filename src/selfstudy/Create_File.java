package selfstudy;

import java.io.File;
import java.io.IOException;

public class Create_File {

	public static void main(String[] args) {

		try {

			File myobj = new File("C:\\Users\\DECOMM\\Downloads\\Demo.test");

			if (myobj.createNewFile()) {

				System.out.println("File created" + myobj.getName());

			} else
				System.out.println("File already exits");

			
			
		}

		catch (IOException e) {

			System.out.println("An error occured");
			e.printStackTrace();

		}

	}

}
