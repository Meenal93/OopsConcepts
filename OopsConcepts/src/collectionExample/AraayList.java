package collectionExample;

import java.util.ArrayList;
import java.util.Iterator;

public class AraayList {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		list.add("My");
		list.add("name");
		list.add("is");
		list.add("Minal.");
		list.add("I am");
		list.add(25);
		
		System.out.println(list);
		
		System.out.println("Object is : " + list.get(2));
		System.out.println("Size of the list is : " + list.size());
		
		list.remove(4);
		System.out.println(list);
		
		/*using for loop*/
		
	for (int i = 0; i < list.size(); i++) {
		
		System.out.println(list.get(i));		
		
	}
	
	for (Object var:list) {
		
		System.out.println(var);
	}
	
	
	Iterator itr =list.iterator();
	
	while(itr.hasNext());
	
	System.out.println(itr.next());
		

	}

}
