package staticexample;

//Java Program to demonstrate the use of an instance variable  
//which get memory each time when we create an object of the class.  
class Counter {
	//static int count = 0;// will get memory each time when the instance is created

	static int count = 0;// will get memory only once and retain its value

/*	public static void displayValue() {
		int x = 10;
		System.out.println("Value of x : " + x);
	}*/
    
static {
		System.out.println("static block is invoked");
	}

	Counter() {
		count++;// incrementing value
		System.out.println(count);
	}

	public static void main(String args[]) {
		// Creating objects
	Counter c1 = new Counter(); 
		Counter c2 = new Counter();
		Counter c3 = new Counter();
		
	//	Counter.displayValue();
		

		// Counter.displayValue();
	}
}