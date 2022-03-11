package basic;

import java.util.Scanner;

public class CalculaterPrgm {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Type your string : ");
		String st=sc.next();
		System.out.println(" Your string is : "+st);
		sc.close();
		for (int i= 0;i<st.length();i++) {
			
			char ch=st.charAt(i);
			System.out.println("Character at  :"+i+"  "+ch);
			
			
			}
	}

}
