import java.util.ArrayList;
import java.util.Collection;

public class Pracice_4 {

	public static void main(String[] args) {
		Collection<Object>  values=new ArrayList<>();
		values.add(40);
		values.add("a");
		values.add(10);
		
		values.size();
		
	
		System.out.println("Array elements are :"+values.size());
		values.remove(40);
		System.out.println("Array elements are :"+values);
	}

}
