package basic;

public class BasicArray {

	public static void main(String[] args) {
	/*	int arr[]= {10,20,30,40,50};
		
		System.out.println("Your array's first element is :"+arr[0]);
		System.out.println("Your array's second element is: "+arr[1]);
		System.out.println("Your array's third element is :"+arr[2]);
		System.out.println("Your array's forth element is :"+arr[3]);
		System.out.println("Your array's fifth element is :"+arr[4]);
		System.out.println();*/
		
		int arr1[][]= {{17,20,46,14},{14,67,65,35},{55,88,96,22}};
		//int arr2[][]= {{76,77,87},{23,44,56}};
		//int arr3[][]= new int [33][56];
		for (int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				
				System.out.print(" " +arr1[i][j]);
				
			}
			System.out.println();
		
		}
		
	}
	
}
