package Controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

import Models.Student;

public class StudentRegisterServlet extends HttpServlet{
	public void doGet(HttpServletRequest request , HttpServletResponse response) throws IOException,ServletException{

			String userName = request.getParameter("uname");
			int age = Integer.parseInt(request.getParameter("age"));
			String college = request.getParameter("college");
			String degree = request.getParameter("degree");

			Student s = new Student();
			s.setName(userName);
			s.setAge(age);
			s.setCollege(college);
			s.setDegree(degree);

			s.register();

			request.getRequestDispatcher("next.jsp").forward(request , response);
		
	}
}