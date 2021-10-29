package studentmanagementsystem.service;

import studentmanagementsystem.bean.Student;
import studentmanagementsystem.dao.StudentDAO;

public class StudentService {

	
	StudentDAO studentDAO = new StudentDAO();
	
	
	public void getAllStudent() {
		
		studentDAO.showStudent();
		
	}


	public void addStudent(Student std) {
		
		
		studentDAO.addStudent(std);
		
	}

}
