import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collection_Practice2 {

	public static void main(String[] args) {

		Collection<Object> values=new ArrayList<Object>();
		values.add("Navin");
		values.add(01);
		values.add("Suraj");
		values.add(02);
		values.add("Sony");
		values.add(03);
		values.add("Pravin");
		values.add(04);
		values.add("Sachin");
		values.add(05);
		values.add("Sachin");
		
		Iterator<Object> it= values.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
		
	}

}
