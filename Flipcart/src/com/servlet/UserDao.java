package com.servlet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.flipkart.ConnectionFactory;
import com.flipkart.PojoClass;
public class UserDao {

	public int insert(PojoClass p) throws SQLException {
		
	
	
	
		String sql =   "insert into uservalues values (?,?,?)";
		    Connection con =ConnectionFactory.getConnection();
		   
			  PreparedStatement pst =   con.prepareStatement(sql);
			  pst.setString(1, p.getEmail());
			  pst.setString(2, p.getPassword());
			  pst.setString(3, p.getRepeatpassword());
			  int output =pst.executeUpdate();	
		return output;
	
	
		//return "inserted";
}
	
public  boolean validate(String email,String password) {
		
		System.out.println(email+" "+password);
		try {
		 //String queryString = "SELECT * FROM users where user_emailid=? and user_password=?";
			Connection con=ConnectionFactory.getConnection();
			System.out.println(con);
					String query = "SELECT email, password FROM uservalues";
			
		     PreparedStatement s=con.prepareStatement(query);
		      
		     
		      ResultSet results =s.executeQuery(query);
		    
			
			 while (results.next())
			 { 
				 System.out.println("inside while");
				 String emailid = results.getString("EMAIL");
			  String pass = results.getString("PASSWORD");
			  
			 if ((email.equals(emailid)) && (password.equals(pass)))
			 { 
				 
				 return true;
			
			 }
			 
			 }
			
		      
		}
		catch (Exception e) {
			 e.printStackTrace();
		}
		return false;
		 
		
}		
}	
