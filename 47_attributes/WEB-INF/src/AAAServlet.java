import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class AAAServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
			HttpSession session = request.getSession();
			ServletContext context = getServletContext();
			
			System.out.println("~~~~~~inside AAAServlet");

			request.setAttribute("name","mohan");
			session.setAttribute("name","kartik");
			context.setAttribute("name","sonakshi");
		
			request.getRequestDispatcher("aaa.html").forward(request,response);
	}
}