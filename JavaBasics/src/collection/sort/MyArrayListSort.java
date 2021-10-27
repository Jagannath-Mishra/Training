package collection.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyArrayListSort {

	public static void main(String a[]) {

		List<Empl> list = new ArrayList<Empl>();
		
		
		list.add(new Empl("Ram", 3000));
		list.add(new Empl("John", 10000));
		list.add(new Empl("John", 15000));
		list.add(new Empl("Rama", 2400));
		list.add(new Empl("Rajesh", 2400));
		list.add(new Empl("Tom", 2400));
		list.add(new Empl("Abhi", 2400));
		list.add(new Empl("S", 2400));
		
		
	
		
		
		Collections.sort(list,(x,z)->x.getName().compareTo(z.getName()));
		
		
		
		
		
		System.out.println("Sorted list entries: ");
		for (Empl e : list) {
			System.out.println(e);
		}
	}
}



class Empl {

	private String name;
	private Integer salary;

	public Empl(String n, int s) {
		this.name = n;
		this.salary = s;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public String toString() {
		return "Name: " + this.name + "-- Salary: " + this.salary;
	}
}