package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class ActionServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
				HttpSession session = request.getSession();
				request.setAttribute("mno",1234);
				session.setAttribute("mno","kartik");

				request.getRequestDispatcher("next.jsp").forward(request,response);
	}
}