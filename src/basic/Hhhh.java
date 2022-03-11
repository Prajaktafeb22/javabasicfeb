package basic;

public class Hhhh {

    private static int i=0;
	int j;
	Hhhh(){
		
		System.out.println("cONSTRUCTOR CALLED");
	}
	
	Hhhh(int i, int j){
		
		System.out.println("overload CALLED");
	}
	
	
	public void display()
	{
			System.out.println("display CALLED");
	}
	
	public int display(int i)
	{
			System.out.println("display int CALLED" + i);
			
			return i;
	}
	
	public String display(int i,int y)
	{
			System.out.println("display int CALLED" + i);
			
			return " ";
	}
	
	public int Add(int a,int b)
	{
		return a+b;
	}
	
	public int Add(int a,int b,int c)
	{
		return Add(a,b)+c;
	}
	
	public int Add(int a,int b,int c,int d)
	{
		return Add(a,b,c)+d;
	}
	
	public int Add(int a,int b,int c,int d,int e)
	{
		return Add(a,b,c,d)+e;
	}
	
	
	
	public static void main(String[] args) {
	System.out.println(i);
		Hhhh h =new Hhhh(10,20);
	h.display(4);		
	}
	
	


}
