import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class QrtServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
			HttpSession session = request.getSession();

			System.out.println("QrtServlet Starts");
			System.out.println("new or Not:"+session.isNew());
			System.out.println(" ID:"+session.getId());
			 System.out.println("QrtServlet Ends");
			request.getRequestDispatcher("mohan.html").forward(request,response);
	}
}