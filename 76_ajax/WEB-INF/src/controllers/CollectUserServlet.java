package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.ArrayList;

import models.User;
import com.google.gson.Gson;

public class CollectUserServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException ,ServletException{
				ArrayList<User> users = User.collectUser();
				
				Gson gson = new Gson();
				String jsonString =  gson.toJson(users);

				response.getWriter().write(jsonString);
    }
}