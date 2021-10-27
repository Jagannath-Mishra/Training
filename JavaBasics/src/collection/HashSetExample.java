package collection;

import java.util.HashSet;

public class HashSetExample {
   public static void main(String args[]) {
      // HashSet declaration
      HashSet<String> hset = 
               new HashSet<String>();

      // Adding elements to the HashSet
      hset.add("Apple");
      hset.add("Mango");
      hset.add("Grapes");
      hset.add("Orange");
      hset.add("Fig");
      //Addition of duplicate elements
      hset.add("Apple");
      hset.add("Mango");
      //Addition of null values
      hset.add(null);
      hset.add(null);

      //Displaying HashSet elements
      System.out.println(hset);
    }
}


/*boolean add(Element  e): It adds the element e to the list.
void clear(): It removes all the elements from the list.
Object clone(): This method returns a shallow copy of the HashSet.
boolean contains(Object o): It checks whether the specified Object o is present in the list or not. If the object has been found it returns true else false.
boolean isEmpty(): Returns true if there is no element present in the Set.
int size(): It gives the number of elements of a Set.
boolean(Object o): It removes the specified Object o from the Set.*/