package stringclass;

public class StringMethodExample {
	public static void main(String[] args) {
		
		
		// String Concatenation
		String str1 = "Rock";
		String str2 = "Star";
		
		// Method 1 : Using concat
		String str3 = str1.concat(str2);
		System.out.println(str3); // Rock Star
		// Method 2 : Using "+" operator
		
		
		String str4 = str1 + str2;
		System.out.println(str4); // Rock Star
		
		String str_Sample = "Rock Star";
		  //Length of a String
		System.out.println("Length of String: " + str_Sample.length()); //9
		
		
		
		//Character at position
		String str_Sample1 = "RockStar";
		System.out.println("Character at position 5: " + str_Sample1.charAt(5));  //S
		//Index of a given character
		System.out.println("Index of character 'S': " + str_Sample1.indexOf('r'));//8
		
		
		
		//Compare to a String
		String str_Sample11 = "RockStar";
		  System.out.println("Compare To 'ROCKSTAR': " + str_Sample11.compareTo("rockstar"));
		  //Compare to - Ignore case 
		  System.out.println("Compare To 'ROCKSTAR' - Case Ignored: " + str_Sample11.compareToIgnoreCase("ROCKSTAR"));
		  
		  
		  //Contains
		  String str_Sample2 = "RockStar";
		  System.out.println("Contains sequence 'tar': " + str_Sample2.contains("tar"));
		  
		//Convert to LowerCase
		  String str_Sample5 = "RockStar";
		  System.out.println("Convert to LowerCase: " + str_Sample5.toLowerCase());
		  //Convert to UpperCase
		  System.out.println("Convert to UpperCase: " + str_Sample5.toUpperCase());
		  
		  
		  
		  
		  
	}
}