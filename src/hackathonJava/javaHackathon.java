package hackathonJava;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class javaHackathon {
  
	public static void main(String[] args) {
		//testCase1();
		//testCase2();
		//testCase3();
		//testCase4();
		//testCase5();
		//testCase6();
		//testCase8();
		//testCase9();
		//testCase10();
		//testCase11();
		//testCase12();
		//testCase13();
		testCase14();
		
	}

	private static void testCase1() {
		// Consider there is a 3 Boolean variable called a, b, c. Check if at least two out of three Booleans are true
		
		boolean a=false,b=false,c=true;
		
		if((a&&b)||(b&&c)||(a&&c)) {
			
			System.out.println(" two boolean var are true");
			
			
		}
		else System.out.println("two boolean var are not true");
		
	}
	
	public static void testCase2() {
//Q2. write a program to find factorial (Non Recursive) *		
		
	int result=1;
	int factNum=5;
	for(int i=1;i<=factNum;i++) {
		
		result=result*i;
		
	}	
		
		System.out.println(result);
		
		
		
	}
	
	
	public static void testCase3() {
//Q3. Given an array of integers, sort the integer values. 		
		
		int[]input= {5,8,1,7,6,0,66};
		
//		Arrays.sort(input);
//		System.out.println(Arrays.toString(input));
		
		for(int i=0;i<input.length;i++) {
			
			for(int j=i+1;j<input.length;j++) {
				
				if(input[i]>input[j]) {
					
					int temp=input[i];
					input[i]=input[j];
					input[j]=temp;
					
				}
			}
		}
		
		System.out.println(Arrays.toString(input));	
	}

	
public static void  testCase4() {
//Q5. Given an array prints the unique numbers and also prints the number of occurrences of duplicate numbers. 	
	
	int[]input= {5,9,7,6,3,3,3,1,0,8,8,8,8,8,8};
	
	Map<Integer,Integer> mp = new  HashMap<>();
	
	for(int i=0;i<input.length;i++) {
		
		if(mp.containsKey(input[i])) {
			
			mp.put(input[i],mp.get(input[i])+1);
			
		}
		
		else {
			
			mp.put(input[i], 1);
		}
		
		
	}
	
	mp.forEach(
			
			(x,y)->
			   {
				   if(y == 1)
				   {
					   System.out.println("Unique numbers are :"+x );   
				   } 
				   
				   else if(y>=2) {
					   System.out.println(x + " is present " + y + " times");}
				   
			   }	 
			
			);
	


}	
	
public static void testCase5() {
//Q6. WJP to perform ascending order Selection sort 	
	
	//Using user input through scanner
	
	System.out.println("Enter the Size of the array :");
	Scanner sc= new Scanner(System.in);
	int size= sc.nextInt();
	System.out.println("Enter array element : ");
	int[]input = new int[size];
	for(int i=0;i<size;i++) {
		
		input[i]=sc.nextInt();
	}
	
	for(int i=0;i<size;i++) {
		
		for(int j=i+1;j<size;j++) {
			
			if(input[i]>input[j]) {
				
				int temp=input[i];
				input[i]=input[j];
				input[j]=temp;		
			}
			
		}
		
	}
	System.out.println(Arrays.toString(input));
	
	
}	


 public static void testCase6() {
//Q9 How can we make String uppercase to lowercase?

	 String s="toupper";
	 String s1="TOLOWER";
	 System.out.println(s.toUpperCase());
	 System.out.println(s1.toLowerCase());
	 
	 
	 
	 
	 
	 
 }
 
public static void testCase7() {
//Q12. Write a program to check palindrome (MalayalaM) for both numbers and string?	
	
	
	
	
	
	
	
}
  
public static void testCase8() {
	
//Q13. Given a string print the reverse of the string.(Input: Java Code Output: edoC avaJ)	
	
	String a="java code";
	
	for(int i=a.length()-1;i>=0;i--) {
		
		System.out.print(a.charAt(i));
		
	}
	
	
	
	
	
	
}

public static void testCase9() {
//Q14. Given a string print the reverse of the words string.(Input: Java Code Output: Code Java) 
	
	System.out.println("Enter your string :");
	
	Scanner inputscanner=new Scanner(System.in);
	
	String inputstring=inputscanner.nextLine();
	
	
	String[] words = inputstring.split(" ");
	
	for(int i=0;i<words.length;i++) {
		System.out.println(words[words.length-1-i]);
		
		
	}
   inputscanner.close();
}



public static void testCase10() {
	
//Q15. Given a string print the unique words of the string.	
	
	String input="hello";
	
	HashMap<Character,Integer> hm= new HashMap<Character,Integer>();
	
	for(int i=0;i<input.length();i++) {
		char currentChar=input.charAt(i);
		
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
				   if(y == 1)
				   {
					   System.out.println("Unique numbers are :"+x );   
				   } 
				   
				   else if(y>=2) {
					   System.out.println(x + " is present " + y + " times");}
				   
			   }	 
			
			);
	
	
	
	
}

public static void testCase11() {

	//Q16. Write a method that will remove a given character from the String?
	
	String original="welcome";
	String replace="wel";
	
	String a=original.replaceAll(replace, "");
	
	System.out.println(a);
	

	
}


public static void testCase12() {
//Q17. WJP to find total number of integers, uppercase and lowercase character in the give string *	
	
	String test="Welcome21Java";
	int intCount = 0,upperCount = 0,lowerCount = 0;
	for(int i=0;i<test.length();i++) {
		
		if(test.charAt(i)>='0' && test.charAt(i)<='9') {
			
			intCount++;
			
		}
		
		else if(test.charAt(i)>='a' && test.charAt(i)<='z') {
			
			lowerCount++;
			
		}
        else if(test.charAt(i)>='A' && test.charAt(i)<='Z') {
			
        	upperCount++;
			
		}
		
	}
	
	System.out.println(intCount);
	System.out.println(lowerCount);
	System.out.println(upperCount);
	
}

public static void testCase13() {
	
//Q18. WJP to display duplicate character in string *	
	
	String test="welcome";
	HashMap<Integer,Integer>hm = new HashMap<Integer,Integer>();
	for(int i=0;i<test.length();i++) {
		
		if(hm.containsKey(test.charAt(i))) {
			
			hm.put((int) test.charAt(i),hm.get(test.charAt(i))+1);
			
		}
		else {
			
			hm.put((int) test.charAt(i),1);
		}
		
	}
	
	hm.forEach((key , value)->{
  		if(value > 1)
  			System.out.println( "Duplicate characters are :"+key);
  		
  		
  		
  	});

	
	
}


public static void testCase14() {
	
//Q19. WJP to display number of occurrence of all character *	
//
//Q20. WJP to find total number of repeated integers, uppercase and lowercase character in the give string *
//Q21. WJP to convert string to int ?
    
	System.out.println("Enter the string ");
	Scanner sc = new Scanner(System.in);
	String input =sc.next();
	
	int test=Integer.parseInt(input);
	System.out.println(test);
	
	
	
	
	
	
	
	
	
	
}







	
	
}	
	




	

