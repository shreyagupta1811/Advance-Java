import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class XyzServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
			HttpSession session = request.getSession();

			System.out.println("XyzServlet Starts");
			System.out.println("new or Not:"+session.isNew());
			System.out.println(" ID:"+session.getId());
			 System.out.println("XyzServlet Ends");
			request.getRequestDispatcher("pqr.html").forward(request,response);
	
	}
}