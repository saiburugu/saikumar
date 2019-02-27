package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.jni.User;

import com.flipkart.PojoClass;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter w=response.getWriter();
		  
		   String email=request.getParameter("email");
		   String password=request.getParameter("psw"); 
		   String rpassword=request.getParameter("psw-repeat");
		   UserDao u=new UserDao();
        try {
        	System.out.println(u.insert(new PojoClass(email,password,rpassword)));
        	response.sendRedirect("JSP/login.jsp");
        }
	catch (SQLException e1) {
		e1.printStackTrace();
	}
        
       
		
		
}
}
