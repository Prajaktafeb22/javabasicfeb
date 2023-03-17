
public class Fact_Recursion {

	public static void main(String[] args) {
		
		int i=5;
		
		int result=factorial(i);
		
		
	}
	
	public static int factorial(int i)	
	{
		if(i==1)
			return i; 
		
		return i *factorial(i-1);
		
	}

}
