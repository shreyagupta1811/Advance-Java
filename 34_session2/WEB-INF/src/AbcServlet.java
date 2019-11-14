import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.Date;

public class AbcServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
			HttpSession session = request.getSession();
			
			System.out.println("AbcServlet Starts");
			System.out.println("new or Not:"+session.isNew());
			System.out.println(" ID:"+session.getId());
			System.out.println(" Creation Time:"+new Date(session.getCreationTime()));
			System.out.println(" LastAcess Time:"+new Date(session.getLastAccessedTime()));
			session.setMaxInactiveInterval(1);
			System.out.println("Max Inactive Time:"+session.getMaxInactiveInterval());
			 System.out.println("AbcServlet Ends");
			
			request.getRequestDispatcher("mno.html").forward(request,response);
	}
}