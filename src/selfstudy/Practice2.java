package selfstudy;

enum  flavor{

	 vanilla,pista,strawberry,mango,pinapple;
}


public class Practice2 {

	public static void main(String[] args) {

		flavor flv=flavor.pinapple;

		if(flv ==flavor. mango) {

			System.out.println("Flavor is Mango");


		}
		else if (flv ==flavor.pinapple) {

			System.out.println("Flavor is Pinapple");
		}
		else if (flv ==flavor.pista) {

			System.out.println("Flavor is Pista");
		}
		else if (flv ==flavor.strawberry) {

			System.out.println("Flavor is Strawberry");
		}

		else if (flv ==flavor.vanilla) {

			System.out.println("Flavor is Vanilla");
		}
		else System.out.println("Flavours not available");
	}
}
