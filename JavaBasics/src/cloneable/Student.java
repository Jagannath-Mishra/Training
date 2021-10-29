package cloneable;
// Java program to Demonstrate the
// application of Cloneable interface

class Student implements Cloneable{

	// attributes of Student class
	String name = null;
	int id = 0;


	// parameterized constructor
	Student(String name, int id)
	{
		this.name = name;
		this.id = id;
	}
	
	public static void main(String[] args) throws CloneNotSupportedException
	{
		// create an instance of Student
		Student s1 = new Student("Ashish", 121);

		
		
		// Try to clone s1 and assign
		
		// the new object to s2
		Student s2 = (Student) s1.clone();
		
		//Student s3 = s1; // sallow copy 
		
		s1.id = 50;
		
		s2.id = 100;
		
		System.out.println(s2.id + " "+ s1.id);
	}
}
