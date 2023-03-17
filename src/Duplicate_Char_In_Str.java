import java.util.*;

public class Duplicate_Char_In_Str {

	public static void main(String[] args) {
		System.out.println("Enter your string :");
		
		Scanner input=new Scanner(System.in);
	    String s=input.nextLine();
    
      
      HashMap<Character,Integer> charcount = new HashMap<Character,Integer>();
       input.close();
     
      	for( int i=0;i<s.length();i++) 
      	{
      		Character currentchar =s.charAt(i); 
      		if(!charcount.containsKey(currentchar))
      		{
      			charcount.put(currentchar, 1);
      		}
      		else
      		{
      			charcount.put(currentchar, charcount.get(currentchar) +1 );
      		}
      		
      	}
      	
      	charcount.forEach((key , value)->{
      		if(value > 1)
      			System.out.println( "Duplicate characters are :"+key);
      		
      		
      		
      	});
      	
   

}

}