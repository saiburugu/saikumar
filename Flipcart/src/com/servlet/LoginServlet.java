package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.UserDao;
import com.flipkart.PojoClass;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

    public LoginServlet() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter w=response.getWriter();
		  
		   String email=request.getParameter("email");
		   String password=request.getParameter("psw"); 
		   UserDao u=new UserDao();

		 boolean status=false;
	     status=u.validate(email,password);
		System.out.println(status);
		 PrintWriter out=response.getWriter();
		if(status==true)
		{
			
			response.sendRedirect("JSP/Checkout.jsp");
			
		}
		else
		{
			out.print("Invalid UserName and Password");
		}

	}

}
