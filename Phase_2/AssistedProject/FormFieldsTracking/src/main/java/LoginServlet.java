<<<<<<< HEAD
import java.io.*;
import java.io.PrintWriter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;




/**
* Servlet implementation class LoginServlet
*/
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
        private static final long serialVersionUID = 1L;
       
    /**
* @see HttpServlet#HttpServlet()
*/
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

        /**
         * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
         */
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                // TODO Auto-generated method stub
                 PrintWriter out = response.getWriter();
                 out.println("<html><body>");
                    
                 String userId = request.getParameter("userid");
                 //creating a new hidden form field
                out.println("<form action='dashboard' method='post'>");
                out.println("<input type='hidden' name='userid' id='userid' value='"+userId+"'>");
                out.println("<input type='submit' value='submit' >");
                out.println("</form>");
                out.println("<script>document.forms[0].submit();</script>");
              
                
        }

        /**
         * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
         */
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                // TODO Auto-generated method stub
                doGet(request, response);
        }

}

=======
import java.io.*;
import java.io.PrintWriter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;




/**
* Servlet implementation class LoginServlet
*/
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
        private static final long serialVersionUID = 1L;
       
    /**
* @see HttpServlet#HttpServlet()
*/
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

        /**
         * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
         */
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                // TODO Auto-generated method stub
                 PrintWriter out = response.getWriter();
                 out.println("<html><body>");
                    
                 String userId = request.getParameter("userid");
                 //creating a new hidden form field
                out.println("<form action='dashboard' method='post'>");
                out.println("<input type='hidden' name='userid' id='userid' value='"+userId+"'>");
                out.println("<input type='submit' value='submit' >");
                out.println("</form>");
                out.println("<script>document.forms[0].submit();</script>");
              
                
        }

        /**
         * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
         */
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                // TODO Auto-generated method stub
                doGet(request, response);
        }

}

>>>>>>> 08b7d28c0e6f394d0e486bb5c69d076bd7dfc492
