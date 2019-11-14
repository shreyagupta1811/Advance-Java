package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

import models.User;

public class ActionServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		User user = new User();
		
		user.setName("shivanshi");
		user.setAge(21);

		request.setAttribute("users",user);

		//request.getRequestDispatcher("next1.jsp").forward(request,response);
		  request.getRequestDispatcher("next2.jsp").forward(request,response);
	}
}