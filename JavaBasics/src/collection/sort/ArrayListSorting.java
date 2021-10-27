package collection.sort;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSorting {

	public static void main(String args[]) {
		
		
		ArrayList<Students> arraylist = new ArrayList<Students>();
		
		
		
		arraylist.add(new Students("Chaitanya",001,26));
		arraylist.add(new Students("Ram",005,20));
		arraylist.add(new Students("Chaitanya",004,21));
		arraylist.add(new Students("Chaitanya",010,27));
		arraylist.add(new Students("Chaitanya",150,22));
	
		
		
		Collections.sort(arraylist);

		for (Students str : arraylist) {
			System.out.println(str);
		}
	}
}