package selfstudy;

public class ElmntCheck {

	public static void main(String[] args) {
		String str[]= {"Suresh","Jadhav"};
		String s="Sursh";
		boolean found=false;
		
		
		for(int i=0;i<str.length;i++) {
			
			if(s==str[i]) {
				
				System.out.println("Element Found");
				
				found=true;
			}
			
			
			
		}
		
		if(!found) {
			
			System.out.println("Element Not Found");
		}
	}

}
