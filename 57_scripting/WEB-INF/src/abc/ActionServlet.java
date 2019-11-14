package abc;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class ActionServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
			Student s = new Student("mohan",23,"GGCT");

			request.setAttribute("Student",s);

			request.getRequestDispatcher("abc.jsp").forward(request,response);
	}
}