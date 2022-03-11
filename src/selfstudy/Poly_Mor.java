package selfstudy;



//polymorphism overloading
class multifun{

	static int multifun1(int a,int b) {


		return a*b;

	}
	static int multifun1(int a,int b,int c) {


		return a*b*c;

	}


}

public class Poly_Mor {

	public static void main(String[] args) {
   
		System.out.println(multifun.multifun1(20, 30));
		System.out.println(multifun.multifun1(20, 10,40));

	}

}
