package basic;


abstract class shape{
	abstract void display();

}

class Rectangle extends shape{

	void  display(){

		System.out.println("This is Rectangle");
	}
}
class Circle extends shape{

	void  display(){

		System.out.println("This is Circle");
	}
}

public class Practice_Abst {

	public static void main(String[] args) {

shape sp=new Rectangle();
sp.display();
shape sp1=new Circle();
sp1.display();





	}

}
