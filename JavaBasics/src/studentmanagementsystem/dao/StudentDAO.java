package studentmanagementsystem.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import studentmanagementsystem.bean.Student;

public class StudentDAO {

	

	Connection getConnection() throws ClassNotFoundException, SQLException {
		Connection connection = null;
		Class.forName("com.mysql.jdbc.Driver");
		connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/mydb?characterEncoding=latin1&useConfigs=maxPerformance","foo","bar");
		return connection;
	}
	
	
	public void showStudent(){
		Connection con = null;
		
		try {
			 con = getConnection();
			
			Statement stmt=con.createStatement();

			ResultSet rs=stmt.executeQuery("select * from student");

			while(rs.next())
			System.out.println(rs.getInt(1)+" | "+rs.getString(2)+" | "+rs.getInt(3)+" | "+rs.getInt(4)+" | "+rs.getString(5)+" | "+rs.getInt(6));

			
			
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
	}


	public void addStudent(Student std) {
		Connection con = null;
		
		try {
			con =  getConnection();
			
			Statement stmt = con.createStatement();
			
			String sql =  "INSERT INTO student (name, age, tot_mark, address, roll_no) VALUES ('"+std.getName()+"', "+std.getAge()+","+ std.getMark()+",'"+std.getAddress()+"',"+std.getRoll()+")";
			System.out.println(sql);
			stmt.executeUpdate(sql);
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		
	}

}
