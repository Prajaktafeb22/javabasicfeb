package basic;

public class ParaConstr {
	 int j; String nameofstudent;
	 ParaConstr(int i,String name){
		j=i;
		nameofstudent=name;
		 
	 }
	 
	 private void Display() {
			System.out.println("Name is: " +j +" " +nameofstudent);
			
		}
	
	

	public static void main(String[] args) {
		ParaConstr pc= new ParaConstr(1,"Ajinkya");
		pc.Display();
		
		
		
		

	}



	

}
