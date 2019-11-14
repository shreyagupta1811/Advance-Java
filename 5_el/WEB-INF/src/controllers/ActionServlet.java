package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class ActionServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
				request.setAttribute("mno",123);

				HttpSession session = request.getSession();
				session.setAttribute("mno","abhay");

				ServletContext context = getServletContext();
				context.setAttribute("mno",23.67);

				request.getRequestDispatcher("next.jsp").forward(request,response);
	}
}