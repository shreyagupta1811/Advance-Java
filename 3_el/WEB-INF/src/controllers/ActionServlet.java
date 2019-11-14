package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class ActionServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
			HttpSession session = request.getSession();

			request.setAttribute("abc",1234);
			session.setAttribute("mno","mohan");

			request.getRequestDispatcher("nect.jsp").forward(request,response);
	}
}