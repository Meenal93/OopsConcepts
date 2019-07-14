package AbstractClasses;

import java.util.ArrayList;
import java.util.List;

public class GenericArrayList {

	public static void main(String[] args) {


		List <Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(77);
		list.add(29);
		
		int i = list.get(2);
		System.out.println(i);

	}

}
