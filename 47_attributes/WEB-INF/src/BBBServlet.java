import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class BBBServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
			HttpSession session = request.getSession();
			ServletContext context = getServletContext();
			
			System.out.println("~~~~~~inside BBBServlet");
			
			String name1 = (String)request.getAttribute("name");
			String name2 = (String)session.getAttribute("name");
			String name3 = (String)context.getAttribute("name");
			
			session.setMaxInactiveInterval(10);

			System.out.println("~~~~~~Attribute as request scope : "+name1);
			System.out.println("~~~~~~Attribute as session scope : "+name2);
			System.out.println("~~~~~~Attribute as Application scope : "+name3);

			request.getRequestDispatcher("bbb.html").forward(request,response);
	}
}