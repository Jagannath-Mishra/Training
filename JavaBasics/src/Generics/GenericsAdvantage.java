package Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsAdvantage {

	public static void main(String[] args) {
		
		
		
	//  Type-safety:
		
/*		List list = new ArrayList();    
		list.add(10);  
		list.add("10");  
		*/
		
		//With Generics, it is required to specify the type of object we need to store.  
		List<Integer> list1 = new ArrayList<Integer>();    
		list1.add(10);  
		list.add("10");// compile-time error  
		
		
		
	//Type casting is not required:
		
/*		
		List list11 = new ArrayList();    
		list11.add("hello");    
		String s = (String) list11.get(0);//typecasting    
		*/
		//After Generics, we don't need to typecast the object.  
		
		
		List<String> list111 = new ArrayList<String>();    
		list111.add("hello");    
		String s1 = list111.get(0);    
		
		
	// Compile-Time Checking: 
		
		List<String> lists = new ArrayList<String>();    
		lists.add("hello");    
		//lists.add(32);//Compile Time Error
		
		
		
	}
}
