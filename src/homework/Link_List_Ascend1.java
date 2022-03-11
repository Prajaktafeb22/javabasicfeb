package homework;

import java.util.Iterator;
import java.util.LinkedList;

public class Link_List_Ascend1 {

	public static void main(String[] args) {

		
		LinkedList<Integer> ll=new LinkedList<>();
		ll.add(10);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		ll.add(60);
		ll.add(70);
		
		/*Iterator<Integer>it=ll.iterator();
		
	
		while(it.hasNext()) {
			
			System.out.println(it.next());
			
		}
		*/
		
		for(int i=5;i>=0;i--) {
			
			System.out.println(ll.get(i));
		}
		
		
	}

}
