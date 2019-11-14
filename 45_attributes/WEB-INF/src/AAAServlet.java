import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class AAAServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		  HttpSession session = request.getSession();

			System.out.println("~~~~~~~inside AAAServlet");
			System.out.println("~~~~~~Session Id"+session.getId());
			String uname = request.getParameter("uname");
			System.out.println("~~~~~~~uname"+uname);
			session.setAttribute("name",uname);

			request.getRequestDispatcher("aaa.html").forward(request,response);
	}
}