package selfstudy;


class animal{
	
	String name;
	
	
	public void eat() {
		
		System.out.println("I can eat");
		}
	
	
}


class dog extends animal{
	
	public void display() {
	
	System.out.println(" My name is "+name);
	}
}

public class PracticeClass {

	public static void main(String[] args) {
		
		dog dg=new dog();
		
		dg.eat();
		
		dg.name="Cat";
		dg.display();
		
		
	}

}
