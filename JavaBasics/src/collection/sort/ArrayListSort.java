package collection.sort;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort  {

	
	public static void main(String[] args) {
	
	ArrayList<Integer>  aList =  new ArrayList<Integer>();
	
	
	aList.add(10);
	aList.add(5);
	aList.add(2);
	aList.add(20);
	aList.add(15);
	aList.add(6);
	aList.add(9);
	aList.add(44);
	
	
	Collections.sort(aList);
	
	
	System.out.println(aList);
	
	}
	
}
