package Generics;

import java.util.*;

class TestGenerics1 {
	public static void main(String args[]) {
		
		
		
		ArrayList list = new ArrayList();
		list.add("rahul");
		list.add("jai");
		list.add(32);//compile time error
		
		
		System.out.println(list);

		String s = list.get(1);// type casting is not required
		System.out.println("element is: " + s);

		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}*/
	}
}