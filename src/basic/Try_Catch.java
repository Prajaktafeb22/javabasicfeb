package basic;


public class Try_Catch {

	public static void main(String[] args) {

		int i=10;
		int j=0;
		int result=0;

		try  {
			result=i/j;


		}


		catch (Exception e){

			System.out.println("The result is "+result);
			System.err.println("Error");

		}


		finally {

			System.out.println("Finally Executed");
		}
	}

}
