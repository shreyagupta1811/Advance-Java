package Controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

import Models.User;

public class SaveServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response){
				String userName = request.getParameter("uname");
				String email = request.getParameter("email");
				String password = request.getParameter("password");

				User user = new Users();
				user.setUserName(userName);
				user.setEmail(email);
				user.setPassword(password);

				user.saveUser();
				
				request.getRequestDispetcher("next.jsp").forward(request,response);
	}
}