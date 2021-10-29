package studentmanagementsystem.controller;

import java.util.Scanner;

import studentmanagementsystem.bean.Student;
import studentmanagementsystem.service.StudentService;

public class Main {

	public static void main(String[] args) {

		StudentService studentService = new StudentService();

		Scanner myObj = new Scanner(System.in); // Create a Scanner object

		System.out.println("#### Student Management System ####");

		System.out.println("Press (1) -  For List All Student");
		System.out.println("Press (2) -  For Create new Student");
		System.out.println("Press (3) -  For Update Existing Student");
		System.out.println("Press (4) -  For Delete a Student");
		System.out.println("***************************************************");

		int ch = myObj.nextInt();
		

		switch (ch) {

		case 1:
			studentService.getAllStudent();
			break;
			
		case 2:
			System.out.println("Please enter name: ");
			String Sname =  myObj.nextLine();
			
			
			
			Student std = new Student(0, "Rajesh", 26, 950, "Hitech-City", 109);
			
			std.setName(myObj.nextLine());
			
			studentService.addStudent(std);
			break;
			
		case 3:
			System.out.println("Yet to implemnt");
			break;
			
		case 4:
			System.out.println("Yet to implemnt");
			break;
			
		default :
			
			System.out.println("Worng choice");
			break;

		}

	}

}
