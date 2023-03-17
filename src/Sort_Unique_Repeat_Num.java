import java.util.ArrayList;
import java.util.Scanner;

public class Sort_Unique_Repeat_Num {

	public static void main(String[] args) {
		
		System.out.println("Enter your length of an array : ");
		Scanner inputnum=new Scanner(System.in);
        int size=inputnum.nextInt();
        
         ArrayList<Integer> list=new ArrayList<Integer>();
         for(int i=0;i<size;i++) {
        	 System.out.println("Enter your "+(i+1)+" element  of an array : ");         	 
        	 list.add(inputnum.nextInt());
         }
         
         inputnum.close();
         
         
         
	}

}
