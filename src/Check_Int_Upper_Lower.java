import java.util.Scanner;

public class Check_Int_Upper_Lower {

	public static void main(String[] args) {
		 System.out.println("Enter your string : ");
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        
		int lowercasecharcount=0;
		int uppercasecharcount=0;
		int intcharcount=0;
        obj.close();
        
       
		for(int j=0;j<s.length();j++) {


			if(s.charAt(j)>='0'&&s.charAt(j)<='9'){

				intcharcount++;
			}
			if (s.charAt(j)>='a' && s.charAt(j)<='z'){

				lowercasecharcount++;
			}
			if(s.charAt(j)>='A' && s.charAt(j)<='Z'){

				uppercasecharcount++;
			}

		}




		System.out.println("Number of repeated Uppercase char "+uppercasecharcount);
		System.out.println("Number of repeated lowercase char "+lowercasecharcount);
		System.out.println("Number of repeated Int char "+intcharcount);


	}

}
