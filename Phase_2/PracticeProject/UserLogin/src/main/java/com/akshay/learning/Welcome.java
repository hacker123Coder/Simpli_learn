package com.akshay.learning;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.text.html.HTMLDocument.HTMLReader.FormAction;


public class Welcome extends HttpServlet {

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");  
	    PrintWriter out = response.getWriter();  
	          
	    String n=request.getParameter("nm");  
	    out.print("Welcome "+ n);  
	    
	    
		 out.print("<br><form action = 'logout.jsp'><br>");
		    out.print("<input type='submit' value='Logout'></center>");  
		    out.print("</form>");  

	    
	    }  
	}


