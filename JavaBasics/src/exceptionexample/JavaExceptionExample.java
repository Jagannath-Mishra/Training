package exceptionexample;

public class JavaExceptionExample {
	public static void main(String args[]) {
		try {
			
			// code that may raise exception
			int a = 10;
			//int data = 100 / 0;  // exception 
			
			String ss="abc";  
			int i=Integer.parseInt(ss);
			
			int b = 20;
			System.out.println("Addition result:"+ a+b);
		
		} catch (Exception e) {
			System.out.println("skip");
		}
		finally{
			
			//connection.close();
			
			//always execute
		}
		
		// rest code of the program
		System.out.println("rest of the code...");
	}
}
