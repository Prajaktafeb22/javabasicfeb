
public class Types_of__input {

	public static void main(String[] args) {
		String inputstring="Welcome";	
	try
	{
		Integer y= Integer.parseInt(inputstring);
		
		System.out.println("Input is Int");
		return;
	}
	catch (Exception ex)
	{
		
	}
	
	try
	{
		Boolean boolvalue = Boolean.parseBoolean(inputstring);
		
		System.out.println("Input is Bool");
		return;
	}
	catch (Exception ex)
	{
		
	}
	
	System.out.println("Input is string");

}
	}
