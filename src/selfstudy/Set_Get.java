package selfstudy;


class teacher {
	private String designation;
	private String university;
	
	protected void setdesignation(String designation) {
		this.designation = designation;
	}
	protected void setuniversity(String university) {
		this.university = university;
	}
	protected  String getdesignation() {
		return designation;
	}
	protected String getuniversity() {
		return university;
	}
	void display() {
		
		System.out.println("Teaching");
		
	}
}

class programmerteacher extends teacher{
	
}
public class Set_Get {

	public static void main(String[] args) {
		
		programmerteacher pt=new programmerteacher();
		pt.setdesignation("programmer");
		pt.setuniversity("Pune");
		System.out.println(pt.getdesignation());
		System.out.println(pt.getuniversity());
        pt.display();
	}

}
