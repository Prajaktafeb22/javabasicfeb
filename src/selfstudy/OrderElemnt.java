package selfstudy;

import java.util.Scanner;

public class OrderElemnt {

	public static void main(String[] args) {
		
	//	System.out.println("Array elements before order are :");
		
        Scanner obj=new Scanner(System.in);
       
        int size=obj.nextInt();
        
		int ar[]=new int [size];     // obj.nextInt() ;                       // {88,44,63,18,338,86,74,9};
		int temp=0;
		//System.out.println("Array elements before order are :");
		for(int i=0;i<size;i++) {
			ar[i]=obj.nextInt();
			//ar[i]++;
			System.out.print(" "+ar[i]);

		}
   obj.close();
		for(int i=0;i<ar.length;i++) {

			for(int j=i+1;j<ar.length;j++) {

				if(ar[i]<ar[j]) {
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
			System.out.println();
		}
		for(int i=0;i<ar.length;i++) {
			
			System.out.print(" "+ar[i]);
			
			
		}

	}

}
