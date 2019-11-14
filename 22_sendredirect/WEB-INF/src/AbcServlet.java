import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;

public class AbcServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
			response.setContentType("text/html");
			PrintWriter pw=response.getWriter();
				
			//case 1
			//response.sendRedirect("cmn.do");

			//case 2
			//response.sendRedirect("http://localhost:9090/xyz");

			//case 3
			//response.sendRedirect("http://www.google.com");

			//case 4
			//response.sendRedirect("http://localhost:8080/golu");
	}
}