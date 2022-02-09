package com.akshay.learning;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class login extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");  
	    PrintWriter out = response.getWriter();  
		
		//name & password from user
		String name =request.getParameter("nm");
		String password =request.getParameter("pwd");
		
		//correct name & password to be checked
		
		String realname = "Akshay";
		String realpassword ="op";
		
		//checking logic
		
		if(name.equalsIgnoreCase(realname) && password.equals(realpassword)) {
			RequestDispatcher rd=request.getRequestDispatcher("Welcome");  
	        rd.forward(request, response);  
			

		}
		
		else {
			 out.print("Sorry Name or Password Error!");  
		        RequestDispatcher rd=request.getRequestDispatcher("/index.html");  
		        rd.include(request, response);  
		                      
		}
		
		
		
	}

}
