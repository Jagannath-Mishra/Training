package stringclass;

public class StringPerformanceTest {
	public static void main(String[] args) {
		
		
	 	
		long startTime1 = System.currentTimeMillis();
		StringBuilder sb2 = new StringBuilder("Java");
		for (int i = 0; i < 90000; i++) {
			sb2.append("Program");
		}
		
		

		System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime1) + "ms");
	   
		 	
			
		
		
		long startTime = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer("Java");
		for (int i = 0; i < 90000; i++) {
			sb.append("Program");
		}
		 System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");
			
	
		
		long startTime2 = System.currentTimeMillis();
		
		String sb3 = "Java";
		for (int i = 0; i < 90000; i++) {
			sb3= sb3 + "Program";
		}
		
		
		System.out.println("Time taken by String: " + (System.currentTimeMillis() - startTime2) + "ms");

	}
}