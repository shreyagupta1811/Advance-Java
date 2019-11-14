package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class ActionServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
			request.setAttribute("abc",1234);

			request.getRequestDispatcher("nect.jsp").forward(request,response);
	}
}