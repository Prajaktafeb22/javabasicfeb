import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Sort_Array {
public static void main(String[] args) {
	System.out.println("Enter the array length :");
    Scanner obj=new Scanner(System.in);
    int i=obj.nextInt();
    int[]  array = new int[i]; 
    for(int input=0;input<array.length;input++) {
    	System.out.println("Enter the array "+ input + " element ");
    	array[input]=obj.nextInt();
	}
	
	Arrays.sort(array);
	for(int j=0;j<array.length;j++) {
		
		System.out.println(array[j]);
	}
	
}
}
