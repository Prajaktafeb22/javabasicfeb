package basic;
import java.util.Scanner;

public class AvgArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       Scanner sc= new Scanner(System.in);
       
       System.out.println("Enter Array size : ");
       int arraylength=sc.nextInt();
       int total=0;
       int myarray []= new int[arraylength];
       try {
       
       for(int i=0;i<arraylength;i++) {
    	   System.out.println("Enter "+(i+1)+" Array number : ");
    	   myarray[i]=sc.nextInt();  
    	   total=myarray[i]+total;
       }
       System.out.println("Average of an array is : "+(double)total/arraylength);
       sc.close();
       		
       }
       catch(Exception ex)
       {
           System.out.println("This is a invaild entry. Please retry.");

       }

	
	}
 
}
