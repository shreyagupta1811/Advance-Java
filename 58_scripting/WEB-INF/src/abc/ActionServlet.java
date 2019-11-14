package abc;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

import java.util.ArrayList;

public class ActionServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException{
			Student s1 = new Student("mohan",23,"GGITS");
			Student s2 = new Student("kartik",20,"GGCT");
			Student s3 = new Student("sakshi",21,"global");
			Student s4 = new Student("urvashi",22,"shreeRam");

			ArrayList<Student> students = new ArrayList<Student>();

			students.add(s1);
			students.add(s2);
			students.add(s3);
			students.add(s4);

			request.setAttribute("Students",students);

			request.getRequestDispatcher("abc.jsp").forward(request,response);
	}
}