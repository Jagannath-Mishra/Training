package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExamples {
	
	public static void main(String[] args) {
		
		/*
		ArrayList<String> alist=new ArrayList<String>();
		
		List<Integer>  ilist = new ArrayList<Integer>();
		
		
		
		  alist.add("Steve");
	      alist.add("Tim");
	      alist.add("Lucy");
	      alist.add("Pat");
	      alist.add("Angela");
	      alist.add("Tom");
	      alist.add("Tim");
	    
	  
      //displaying elements

	      //Adding "Steve" at the fourth position
	      alist.add(3, "Steve");
	  
	      //displaying elements
	      System.out.println(alist);*/
	     
	      
	      
	      
	      
	      
	      //Change an element in ArrayList
	      
	   ArrayList<String> names = new ArrayList<String>();
	      names.add("Jim");
	      names.add("Jack");
	      names.add("Ajeet");
	      names.add("Chaitanya");
	      names.set(0, "Lucy");
	      
	      //Removing "Chaitanya" and "Jack"
      		names.remove("Jack");
      		names.remove("Chaitanya");
      		
      		
	   //   System.out.println(names);
	      
	      
	      for(String k: names){
	    	  
	    	  System.out.println(k);
	      }
	      
	      
	      
	  
		
	}

}
