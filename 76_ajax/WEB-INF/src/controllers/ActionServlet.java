package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

import models.User;

public class ActionServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException ,ServletException{
			String uname = request.getParameter("user_name");
			String email = request.getParameter("email");
			String password = request.getParameter("password");
			//String repassword = request.getParameter("repassword");

			User user = new User(uname,email,password);

			String resp=null;
			if(user.saveUser()){
					resp="Success";
			}else{
					resp="fail";
			}
			response.getWriter().write(resp);
	}
}