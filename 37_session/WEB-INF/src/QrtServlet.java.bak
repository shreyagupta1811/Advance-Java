import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.*;

public class QrtServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
			HttpSession session = request.getSession();

			response.setContentType("text/html");
			PrintWriter pw= response.getWriter();

			pw.write("<!doctype html>");
			pw.write("<html>");
			pw.write("<head>");
			pw.write("<title>Document</title>");
			pw.write("</head>");
			pw.write("<body>");
			pw.write("<h1>Three Page</h1>");

			   pw.write("Inside QrtServlet ------- start"+"</br>");
				pw.write("Is New: "+session.isNew()+"</br>");
				pw.write("Creation Time: "+new Date(session.getCreationTime())+"</br>");
				pw.write("Last Accessed Time: "+new Date(session.getLastAccessedTime())+"</br>");
				pw.write("ID: "+session.getId()+"</br>");
				pw.write("MaxInactiveInterval: "+session.getMaxInactiveInterval()+"</br>");
				pw.write("Inside QrtServlet ------- end"+"</br>");

			pw.write("</body>");
			pw.write("</html>");
	}
}