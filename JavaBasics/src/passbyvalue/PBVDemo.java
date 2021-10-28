package passbyvalue;

public class PBVDemo {
	 int a = 100;

	int change(int a) {
		a = a + 100;//locally
		
		//System.out.println(a);
		
		return a;
		
	}

	public static void main(String args[]) {
		
		
		
		PBVDemo p = new PBVDemo(); // Creating object
		
		
		System.out.println(" Value (before change)=" + p.a);//100
		
		
		
		p.change(500); // Passing value
		
		
		//System.out.println(" Value (after change)=" + p.a); //600
		
		System.out.println(p.change(500));
	
	}
}