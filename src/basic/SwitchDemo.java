package basic;

import java.io.IOException;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int n=1;n <= 5;n++) 
		{
			

			for(int j=1;j<=5;j++) {
				
				System.out.print(n);
			}
			System.out.println(" ");
		}
		/*for (int n=1;n <= 5;n++) 
		{
			for(int j=4;j >=n;j--) {
				System.out.print(j);

			}
			System.out.println();
		}*/
		try {
			System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
