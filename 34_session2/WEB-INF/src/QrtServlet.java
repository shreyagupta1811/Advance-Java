import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.Date;

public class QrtServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
			HttpSession session = request.getSession();

			System.out.println("QrtServlet Starts");
			System.out.println("new or Not:"+session.isNew());
			System.out.println(" Id:"+session.getId());
			System.out.println(" Creation Time:"+new Date(session.getLastAccessedTime()));
			System.out.println(" Last Acess Time:"+session.getId());
			session.setMaxInactiveInterval(1);
			System.out.println("Max Inactive Time:"+session.getMaxInactiveInterval());
			 System.out.println("QrtServlet Ends");

			request.getRequestDispatcher("mohan.html").forward(request,response);
	}
}