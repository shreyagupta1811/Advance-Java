package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

import models.User;
import models.City;
import models.State;
import models.Address;

public class ActionServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		User user = new User();

		City ct = new City();
		ct.setCityName("bhopal");

		State st = new State();
		st.setStateName("M.P.");

		Address addr = new Address();
		addr.setCity(ct);
		addr.setState(st);

		user.setName("shreya");
		user.setAge(21);
		user.setAddress(addr);
		
		request.setAttribute("user",user);

		//request.getRequestDispatcher("next1.jsp").forward(request,response);
		request.getRequestDispatcher("next2.jsp").forward(request,response);
	}
}