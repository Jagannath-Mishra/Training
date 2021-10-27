package exceptionexample;


class CustomException extends Exception {
	
   String message;
   
   
   CustomException(String str) {
      message = str;
   }
   
  
   public String toString() {
      return ("Custom Exception Occurred : " + message);
   }
}

class ExpDemo {
	
	void display(){
		
		System.out.println("Something");
	}
}




public class MainException {
   public static void main(String args[]) {
	   
	   
	   ExpDemo obj = new ExpDemo();
	   
	   
	   obj.display();
	   
	   
	   
	   
      
   }
}