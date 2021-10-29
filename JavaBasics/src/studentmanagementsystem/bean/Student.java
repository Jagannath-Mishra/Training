package studentmanagementsystem.bean;


public class Student {

	private int id;
	private String name;
	private int age;
	private int mark;
	private String address;
	private int roll;
	
	
	public Student(int id, String name, int age, int mark, String address, int roll) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.mark = mark;
		this.address = address;
		this.roll = roll;
	}


	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", age=" + age + ", mark=" + mark + ", address=" + address
				+ ", roll=" + roll + "]";
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getMark() {
		return mark;
	}


	public void setMark(int mark) {
		this.mark = mark;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public int getRoll() {
		return roll;
	}


	public void setRoll(int roll) {
		this.roll = roll;
	}
	
	
	
	
	
}
