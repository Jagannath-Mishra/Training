package finalexample;
//Java final method
class Bike2 {
	final void run() {
		System.out.println("running");
	}
}

class Honda extends Bike2 {
	void run() {
		System.out.println("running safely with 100kmph");
	}

	public static void main(String args[]) {
		Honda honda = new Honda();
		honda.run();
	}
}