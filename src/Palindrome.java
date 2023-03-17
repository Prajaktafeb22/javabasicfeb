import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		System.out.println("Enter palindrome string :");
		
		Scanner inputpalindrome=new Scanner(System.in);
		String palindrometest =inputpalindrome.next();
		
		inputpalindrome.close();
       
      
       
       int i=0,j=palindrometest.length()-1-i;
       
       while(i<j)
       {
    	   if(palindrometest.charAt(i)!=palindrometest.charAt(j))
    	   {
    		   System.out.println("The string "+palindrometest +"is not palindrome ");
    		   return;
    	   }
    	   
    	   i++;j--;
       }
       
       System.out.println("The string is palindrome "+palindrometest);
       
     
       
	}

}
