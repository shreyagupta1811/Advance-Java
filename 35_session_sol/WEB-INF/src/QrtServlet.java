import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.Date;

public class QrtServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
			HttpSession session = request.getSession();
			
			System.out.println("QrtServlet Starts");
			System.out.println("new or Not:"+session.isNew());
			System.out.println(" ID:"+session.getId());
			System.out.println(" Creation Time:"+new Date(session.getCreationTime()));
			System.out.println(" LastAcess Time:"+new Date(session.getLastAccessedTime()));
			System.out.println("Max Inactive Time:"+session.getMaxInactiveInterval());
			 System.out.println("QrtServlet Ends");
			
			//request.getRequestDispatcher("mno.html").forward(request,response);
			response.setContentType("text/html");
			PrintWriter pw = response.getWriter();

			pw.write("<!doctype html>");
			pw.write("<html>");
			pw.write("<head>");
			pw.write("<title>Document</title>");
			pw.write("</head>");
			pw.write("<body>");
			pw.write("<h1>Mohan PAGE</h1>");
			pw.write("</body>");
			pw.write("</html>");

			pw.flush();
			pw.close();
	}
}