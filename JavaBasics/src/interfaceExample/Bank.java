package interfaceExample;


//interface demo
interface Bank {
	float rateOfInterest();
	
	void run();
}

class SBI implements Bank {
	public float rateOfInterest() {
		return 9.15f;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}

class PNB implements Bank {
	public float rateOfInterest() {
		return 9.7f;
	}
}

class TestInterface2 {
	public static void main(String[] args) {
		Bank b = new SBI();
		System.out.println("ROI: " + b.rateOfInterest()); 
	}
}