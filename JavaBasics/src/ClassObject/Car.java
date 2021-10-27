package ClassObject;

public class Car {

	
	//Data member
	private String name;
	private String colour;
	private double price;
	
	//Method member
	
	void displaySpeed(){
		System.out.println("Running in 100..");
	}
	
	
	void setCarName(String n){
		this.name = n;
	}
	

	void displayCar(){
		System.out.println(name);
	}
	

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Car carT = new Car();
		Car carA = new Car();
		
	//	carObj.displaySpeed();
		
		carT.setCarName("TATA");
		
		carA.name = "Audi";
		
		//carObj.displayCar();
		
		System.out.println(carT.name);
		System.out.println(carA.name);
		
		
		carT.price =  200000.00;
		System.out.println(carT.price);
		System.out.println(carA.price);
		
		
		
		
		
		
		
	}
}
