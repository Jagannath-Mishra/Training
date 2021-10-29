package serilization;

import java.io.Serializable;

public class TestSerializable implements Serializable {
	public int a;
	public String b;
	
	

	// Default constructor
	public TestSerializable(int a, String b) {
		this.a = a;
		this.b = b;
	}

}