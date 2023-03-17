package javafolder;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class javaPractice {

	public static void main(String[] args) throws IOException {
		
		//test1();
		//test5();
		//test8();
		//test9();
		//tets10();
		//test15();
		//test16();
		//test17();
		test18();
		//test19();
		//test20();
		//test22();
		//test23();
		//test24();
	}
	
	
	//WJP given two array A and B find array A is a subset of B or vise versa. 
    public static void test1() {
		
		int[]A= {5,8,9,3,2,6,4};
		int[]B= {5,8,9,3,2,6,4};
		
		
		
		
	//   System.out.println(Arrays.toString(A).equals(Arrays.toString(B)) ? "True" : "False");	
//		if(Arrays.toString(A).equals(Arrays.toString(B))) {
//			
//			System.out.println("True");
//		 }
//		else {
//			
//			System.out.println("False");
//		}
//	
		if(A.length != B.length)
		{
			System.out.println("False");
			return;
		}
		
		for(int i=0;i< A.length ; i++)
		{
			if(A[i]!= B[i])
			{
				System.out.println("False");
				return;
			}
		}
		
		System.out.println("True");
		
	}
	
	
	//WJP to return duplicate elements from k th distance in the given array.
    //int arry[] ={1,3,4,7} and k= 10 return [1,3]
	public static void test2() {
		
		int[]A= {5,8,9,3,2,6,4};
		
		
		
		
  }
	
	//WJP to return array of index that sum to given number K int arry[] ={1,3,4,7} and k= 10 
	//return [1,3] 

	public static void test3() {
	
		
		
		
		
		
	}
	
	
	//WJP  given 3X3 matrix return sum of diagonal and value below diagonal. 
	public static void test4() {
		
		
	}
	
	//WJP to return given string is palindrome or not
	public static void test5() {
		
		String s= "Madam";
		String s1="";
		
		for(int i = s.length() - 1; i >= 0; i--) {
			
		  s1=s1+s.charAt(i);	
			
		}
		
		if(s.equalsIgnoreCase(s1)) {
			
			System.out.println("String is palindrome");
		}
		
		else System.out.println("String is not palindrome");
		
	}
	
	//Implement the multiple inheritance in Java with interface? 

	public static void test6() {
		
		
		
		
		
		
		
	}
	
//Given a string, String email="hi welcome to @schwab.com your new mail is test@sc and test@sc.com" 
//	Write a code to return the following 
//			valid email id's- count  
//			invalid email id's- count 
     public static void test7() {
    	 
    	 
     }
	
	//WJP to remove duplicates from the string
    public static void test8() {
    	
    	String input="majjjjjjjjdam";
    	Set<Character>st = new HashSet<>();
        
    	for(int i=0;i<input.length();i++) {
    		
    		st.add(input.charAt(i));
    		
    	}
    	
    	for(Character ch : st)
            System.out.print(ch);
    	
    }
	
	//11.WJP to move all zeros to end of the array. 
    public static void test9() {
    	
    	
    	int[] A = { 5, 6, 0, 4, 6, 0, 9, 0, 8 };
        int j = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] != 0) {
                //Swap - A[j] , A[i]
                swap(A, j, i); // Partitioning the array
                j++;
            }
        }
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " "); // Print the array
        }
    }
 
    // Utility function to swap two elements of an array
    public static void swap(int[] A, int a, int b)
    {
        int temp = A[a];
        A[a] = A[b];
        A[b] = temp;
    }
    	
 	
    	
    
	
    //12.WJP to find given integer is palindrome or not.
    public static void tets10() {
    	
    	int input=33333;
    	
    	String compareto = String.valueOf(input);
    	String comparewith = new StringBuilder(compareto).reverse().toString();
    	
    	if(compareto.equals(comparewith)) {
    		
    		System.out.println(" true");
    		
    	}
    	
    	else System.out.println("false");
    	
    }
    
    //what it will return //*[@class='a'] //div and //*[@class='a'] /div 
    public static void test11() {
    	
    	
    }
    
    //difference between div[class=' ']  P and  div[class=' '] >P
    //WJP to reverse the word in the sentence and preserve the white space(words can have more than 1 white space in between)

   public static void test12() {
	   
	   
	   
   }
   
   //WJP given array, print pairs equal to given sum 
   public static void test13() {
	   
	   
   }
   
   //WJP to find given string is balanced or not eg: (a[s{abnbc{bbb]d)-- balanced paranthesis                                                    asds)sddf{ds}(hjj--- not balanced string 
   public static void test14() {
	   
	   
   }
   
   
   //Given Array a[] ={1,2,3,4,5,6,2}.Write Java Program to sort it. 
   public static void test15() {
	   
	   
	   int[]a= {1,5,3,6,4,5,6,0};
	   
	   for(int i=0;i<a.length;i++) {
		   
		   for(int j=0;j<a.length;j++) {
			   
			   if(a[j]>a[i]) {
				   
				   int temp=a[i];
				   a[i]=a[j];
				   a[j]=temp;
				   
			   }
		  }
	   }
	   
	   System.out.println(Arrays.toString(a));
	  
   }
  
   
  //Write a program to find the duplicate occurances of integer numbers? 
//   public static void test16() {
//	   
//	   int[] my_array = {1, 2, 5, 5, 6, 6, 7, 2};
//	   
//       for (int i = 0; i < my_array.length-1; i++)
//       {
//           for (int j = i+1; j < my_array.length; j++)
//           {
//               if ((my_array[i] == my_array[j]) && (i != j))
//               {
//                   System.out.println("Duplicate Element : "+my_array[j]);
//               }
//           }
//       }
//   }    
	   
   public static void test16() {
	   
	   int[]input = { 2,8,2,6,4,7,6,2,9,5,1 };
	   
	   Map<Integer,Integer> hm = new HashMap<>();
	   
	   for(int i=0;i< input.length;i++) {
		   
		   if(hm.containsKey(input[i]))
		   {
			   hm.put(input[i], hm.get(input[i]) + 1 );
		   }
		   else
		   {
			   hm.put(input[i], 1);
		   }		   
	   }
	   
	   
	   
	   hm.forEach(
			   (x,y)->
			   {
				   if(y >= 2)
				   {
					   System.out.println(x + " is present " + y + " times");   
				   }   
			   }	   
	     );
	   
	   
   }  
	   
	//How to swap two numbers without using temp variable. 
   
   
   public static void test17() {
	   
	   int a=10;
	   int b=5;
	   
	   System.out.println(a + " a value : ");
	   System.out.println(b + " b value : ");
	   
	   a=a-b;
	   b=a+b;
	   
	   System.out.println(a + " a value : ");
	   System.out.println(b + " b value : ");
	   
 }
   
   
 //How to find occurrences of elements in an array (without using collections). 
 //imagine there is a circular array of elements 5,7,9,0,1,3. Find the minimum element from this array? 
   public static void test18() {
	 
	   
	   String s="saturday";
	   HashMap<Character,Integer>hm =new HashMap<>();
	   
	   for(int i=0;i<s.length();i++) {
		   
		   char currentChar=s.charAt(i);
		   if(hm.containsKey(currentChar)) {
			   
			 hm.put(currentChar, hm.get(currentChar)+1);
			   
		   }
		   else {
			   
			   hm.put(currentChar, 1);
		   }
		   
	   }
	   
	   hm.forEach(
			   
			   (x,y)->
			   {
				   if(y >= 2)
				   {
					   System.out.println(x + " is present " + y + " times");   
				   }   
				   
				   
			   }
			   
			   
			   );
	   
	   
	   
	   
	   
	   
	   
   } 
   
 // WJP to find max no of occurrence of a word in a string?  
   //WJP to find a unique character from a string. 

   public static void test19() {
	   
	   String tests= "occurrence";
	   
	   HashMap<Character,Integer> hm = new HashMap<>();
	   
	    int len=tests.length();

	    
	   for(int i =0;i<len;i++) {
	    	
	    	if(hm.containsKey(tests.charAt(i))) {
	    		
	    		
	    		hm.put(tests.charAt(i),hm.get(tests.charAt(i))+1);
	    		//hm.put(input[i], hm.get(input[i]) + 1 )
	    		
	    	}
	    	
	    	else {
	    		
	    		
	    		hm.put(tests.charAt(i), 1);
	    		
	    	}
	    	
	    	
	    }
	    
	  hm.forEach((x,y)-> {
		   if(y >= 1)
		   {
			   System.out.println(x + " is present " + y + " times");   
		   }   
	  }	);
	  
   
	    
	    
	    //not related to program its another way to create an object of a class.
//	    try {
//			List<Integer> list = List.class.newInstance(); 
//		} catch (InstantiationException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IllegalAccessException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	       
	   
   }
   
 //Find substring in given string.
	  public static void test20() throws IOException{
		  
//		  String string = "Java";
//		  String substring = "va";
//
//		  System.out.println(string.indexOf(substring));
//		  
		  //Writing into file
		  
		  File fl=new File("C:\\Users\\DECOMM\\Desktop\\111.txt");
		 
		  FileWriter wrt=new FileWriter(fl,true);
			wrt.append("new line added again\n");
			System.out.println("Written succesfully");
			wrt.close();
		  
			Scanner sc=new Scanner(fl);
			while(sc.hasNextLine()) {
			
				System.out.println(sc.nextLine());
				
				System.out.println("Read succesfully");
				
		  
		  
		  
		  
		  
		  
		  
	  }
	     
   
   
}
	  
//Java code for rotating arrays three times?
public static void test21() {
	
	
	
	
	
	
}	  
	  
// Eliminate the vowels from a string?

public static void test22() {
	
	String s = "prajakta";
	String s1="";
	
	for(int i=0;i<s.length();i++) {
		
		if(s.charAt(i) == 'a' || s.charAt(i) == 'e'
                || s.charAt(i) == 'i' || s.charAt(i) == 'o'
                || s.charAt(i) == 'u' || s.charAt(i) == 'A'
                || s.charAt(i) == 'E' || s.charAt(i) == 'I'
                || s.charAt(i) == 'O'
                || s.charAt(i) == 'U') {
			continue;
		}
		
		else {
			
			System.out.println(s.charAt(i));
		}
		
		
	}
	
	

	  

	  
}



//WJP to print unique characters from the string

public static void test23() {
	
	String s = "praja&%$#*kta";
	String s1="";
	
	for(int i=0;i<s.length();i++) {
		
		if(s.charAt(i) == '#' || s.charAt(i) == '@'
                || s.charAt(i) == '"' || s.charAt(i) == '$'
                || s.charAt(i) == '?' || s.charAt(i) == '%'
                || s.charAt(i) == 'E' || s.charAt(i) == '&'
                || s.charAt(i) == '*'
                || s.charAt(i) == '|') {
			System.out.println(s.charAt(i));
			continue;
		}
	}
	}
	
	public static void test24() {
		
		int number  = 123456;//654321		
		
		int result=0;
		while(number >= 1)
		{
			result = result * 10 + number % 10;
			number = number / 10;
		}
		
		System.out.println(result);
		
		
		
		
		
	
}


}	   
 
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   

