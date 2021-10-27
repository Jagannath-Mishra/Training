package exceptionexample;

public class CommonExceptionExample {
	public static void main(String args[]) {
		int x = 10;

		try {

			x = 15/0;

		} catch (Exception e) {

			x = 20;
			System.out.println(x);
			
		} 
		
		finally {
			x = 100;

		}

		System.out.println(x);
	}

}
