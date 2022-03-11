package basic;

class encapTest{
	private int adhar;
	private String empname;
	private int empage;
	
	public void setempadhar(int newvalue) {
		adhar=newvalue;
	}
	
	public void setempname(String newvalue) {
		empname=newvalue;
	}
	public void setempage(int newvalue) {
		empage=newvalue;
	}
	public int getempadhar() {
		return adhar;
	}
	
	public String getempname() {
		return empname;
	}
	public int getempage() {
		return empage;
	}
	
}

public class Inher {

	public static void main(String[] args) {
		encapTest et=new encapTest();
		et.setempname("Suraj");
		et.setempage(68);
		et.setempadhar(12345);
		
		System.out.println("Employee name is"  +" " +et.getempname());
		System.out.println("Employee age is" +" " +et.getempage());
		System.out.println("Employee adhar is" +" "+ et.getempadhar());
		
		

	}

}
