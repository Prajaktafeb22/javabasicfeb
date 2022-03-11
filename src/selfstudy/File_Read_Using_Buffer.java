package selfstudy;

import java.io.*;


public class File_Read_Using_Buffer {

	public static void main(String[] args) throws IOException {

      File fl=new File("C:\\Users\\DECOMM\\Downloads\\Demo.test");
      try {
		FileWriter wrt=new FileWriter(fl);
		wrt.write("My self practice of buffer-reader1\n");
		wrt.write("My self practice of buffer-reader2\n");
		wrt.write("My self practice of buffer-reader3\n");
		wrt.write("My self practice of buffer-reader4\n");
		wrt.write("My self practice of buffer-reader5\n");
		System.out.println("Succesfully written");
		wrt.close();
		
	} catch (IOException e) {
		e.printStackTrace();
	}
    
	try {
		  BufferedReader br = new BufferedReader(new FileReader(fl));
 
      String st=br.readLine();
      while(st!=null) {
    	  
    	  System.out.println(st);
    	   
    	
    	  st=br.readLine();
      }
      
      br.close();
	} 
      catch (FileNotFoundException e) {
  		e.printStackTrace();
  	}
      

	}

}
