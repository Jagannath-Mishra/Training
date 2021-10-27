package stringclass;







public class StringEquals {

	
	 public static void main(String[] args)
	    {
	        String s1 = "HELLO";
	        String s2 = "HELLO";
	        String s3 =  new String("HELLO");
	        
	        
	        
	        System.out.println(s1 == s2); //true
	        System.out.println(s1 == s3); // false
	        System.out.println(s1.equals(s2)); //true
	        System.out.println(s1.equals(s3)); // true
	    }
}















//We can use == operators for reference comparison (address comparison) and 
//.equals() method for content comparison. 
//In simple words, == checks if both objects point to the same memory location