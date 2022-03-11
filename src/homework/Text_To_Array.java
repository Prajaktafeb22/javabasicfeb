package homework;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
// Convert text file data into an array elements
public class Text_To_Array {

	public static void main(String[] args) {
		File file=new File("C:\\Users\\DECOMM\\Downloads\\Demo.test");
		try {
			Scanner sc=new Scanner(file);
			String str=sc.toString();
			ArrayList<String[]> arlst=new ArrayList<String[]>();
			while(sc.hasNextLine()) {

				arlst.add(sc.nextLine().split(" "));//splitting a string
			}

			sc.close();
			Iterator<String[]> it=arlst.iterator();
			while(it.hasNext()) {

				System.out.println(Arrays.toString(it.next()));
			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

	}

}
