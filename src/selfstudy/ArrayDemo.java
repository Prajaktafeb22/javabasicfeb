package selfstudy;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		int ar[] = new int[10];
		int temp;int j=0;int i = 0;
		int counter;
		//getting array from the user
		System.out.println("Define array size :");
		Scanner obj =new Scanner(System.in);
		counter=obj.nextInt();
		System.out.println("Enter array elements :");
	//	obj.close();
		//getting array elements
		for( i=0;i<counter;i++) {
			
			ar[i]=obj.nextInt();
		}
		 
		obj.close();
		
		
		i=0;
		j=counter-1;
		
		//Reversing the array
	while(i<j) {
		
		temp=ar[i];
		ar[i]=ar[j];
		ar[j]=temp;	
		j--;
		i++;
		
	}
	
	//printing the array in reverse order
System.out.println("Reverse array elements :");
	
	for( i=0;i<counter;i++) {
		
		System.out.println(ar[i]);
		
	
		
	}
	
		
	}

}
