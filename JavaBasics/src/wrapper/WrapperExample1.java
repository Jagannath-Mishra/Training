package wrapper;

public class WrapperExample1 {
	public static void main(String[] args) {
		Integer myInt = 5;
		Double myDouble = 5.99;
		Character myChar = Character.valueOf('C');
		System.out.println(myInt);
		System.out.println(myDouble);
		System.out.println(myChar);
		
		
		
/*		the following methods are used to get the value associated with the corresponding wrapper object: 
	    intValue(),
		byteValue(), shortValue(), longValue(), floatValue(),
		doubleValue(), charValue(), booleanValue().*/
		
		  Integer myInt1 = 5;
		    Double myDouble1 = 5.99;
		    Character myChar1 = 'A';
		    System.out.println(myInt1.intValue());
		    System.out.println(myDouble1.doubleValue());
		    System.out.println(myChar1.charValue());
	}
}
