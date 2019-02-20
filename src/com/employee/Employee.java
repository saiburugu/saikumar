package com.employee;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Employee {
	
	public int insert(Employee1 emp) throws SQLException {
		String query="insert into emp values(?,?,?,?,?,?,?,?)";
		Connection conn =ConnectionFactory.getConnection();
		PreparedStatement pStatement= conn.prepareStatement(query);
		pStatement.setInt(1, emp.getEmpNo());
		pStatement.setString(2, emp.getEname());
		pStatement.setString(3, emp.getJob());
		pStatement.setInt(4, emp.getMgr());
		pStatement.setDate(5, emp.getHiredate());
		pStatement.setDouble(6, emp.getSal());
		pStatement.setDouble(7, emp.getComm());
		pStatement.setInt(8, emp.getDeptNo());
		int output=pStatement.executeUpdate();
		return output;
		
	}
	

	public Employee1 read(int empNo) throws SQLException {
		String query="select * from emp where empNo= ?";
		Employee1 emp=null;
		Connection conn = ConnectionFactory.getConnection();
		PreparedStatement pStatement= conn.prepareStatement(query);
		pStatement.setInt(1, empNo);
		ResultSet resultSet=pStatement.executeQuery();
		while(resultSet.next()) {
			emp=new Employee1();
			emp.setEname(resultSet.getString("ename"));
		}
		return emp;
	}
	public Employee1 update(int empNo) throws SQLException {
		String query="update set  emp where empNo= ?";
		Employee1 emp=null;
		Connection conn = ConnectionFactory.getConnection();
		PreparedStatement pStatement= conn.prepareStatement(query);
		pStatement.setInt(1, empNo);
		int output=pStatement.executeUpdate();
		return output;
		
		public Employee1 delete(int empNo) throws SQLException {
			String query="delete emp set='sai'   where empNo= ?";
			Employee1 emp=null;
			Connection conn = ConnectionFactory.getConnection();
			PreparedStatement pStatement= conn.prepareStatement(query);
			pStatement.setInt(1, empNo);
			int output=pStatement.executeUpdate();
			return output;
		
	
	
	public static void main(String[] args) {
		try {
			//System.out.println(new EmployeeDAO().insert(new Employee(7369, "sai", "Manager", 7369, new java.sql.Date(Calendar.getInstance().getTime().getTime()), 5000.00, 500.00, 20)));
			System.out.println(new Employee().read(7369));
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}

