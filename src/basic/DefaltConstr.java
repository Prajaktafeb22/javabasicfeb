package basic;

public class DefaltConstr {
	
	 int id;
     String name;//Default constructor created
	 //DefaltConstr(){}
	
     DefaltConstr( )
     {
    	 
     }
	

	public static void main(String[] args) {
		
   DefaltConstr def= new DefaltConstr ();
   //First student information
    def.id=101;
    def.name="Ajinkya";
    System.out.println(def.id );
    System.out.println("Student name is :" + def.name );
    
    //Second student information
   DefaltConstr def1= new DefaltConstr ();
   def1.id=102;
   def1.name="Ajin";System.out.println(def1.id );
   System.out.println("Student name is :" +def1.name );	
		
		
	}

}
