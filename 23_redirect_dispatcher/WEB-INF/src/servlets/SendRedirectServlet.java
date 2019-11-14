package servlets;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;

public class SendRedirectServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
					response.setContentType("text/html");
					PrintWriter pw=response.getWriter();
					
					//case 1
					//RequestDispatcher view = request.getRequestDispatcher("xyz/resp.html");  //---5
					//RequestDispatcher view = request.getRequestDispatcher("resp.html");   //---3
					//RequestDispatcher view = request.getRequestDispatcher("/resp.html");    //---2
					//RequestDispatcher view = request.getRequestDispatcher("/xyz/resp.html");    //---1
					//RequestDispatcher view = request.getRequestDispatcher("../resp.html");   //----2
					//RequestDispatcher view = request.getRequestDispatcher("../../xyz/resp.html");    //---error
					//view.forward(request,response);

						//case 2
					//response.sendRedirect("abc/xyz/resp.html");    //404 error
					//response.sendRedirect("xyz/resp.html");			
					//response.sendRedirect("/xyz/resp.html");   //if start with direct / than it means  in  webapps
					//response.sendRedirect("http://www.google.com");
					//response.sendRedirect("http://localhost:8080/golu");
	}
}