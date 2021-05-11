package com.cesaregistration.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.cesaregistration.pojo.DBUtil;
import com.cesaregistration.pojo.Registration;




public class RegistrationDAO {    
    public Connection getConnection(){
    	Connection connection = DBUtil.getConnection();
	if(connection != null)
		System.out.println("DB Connection !!!!!");
	return connection;
    }

    
    public String insert(Registration reg)
	{
    	String result = "Data entered successfully";
		/* Connection con = getConnection(); */
    	try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    	Connection con;
    	
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "localhost", "localhost");
			String sql = "insert into cesa_registration (ID,STUDENT_NAME,ROLL_NO,DEPARTMENT,YEAR) values(sequence_id.nextval,?,?,?,?)";
		
			PreparedStatement ps;
			ps = con.prepareStatement(sql);
			//ps.setString(1, "sequence_id.nextval");
			ps.setString(1, reg.getStudentName());
			ps.setString(2, reg.getRollNo());
			ps.setString(3, reg.getDepartment());
		    ps.setString(4, reg.getYear());
			ps.executeUpdate();
			result = "Registration Successfull!!";
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			result = "Something went wrong....";
		}
		  return result;
		 
	}
    
}
