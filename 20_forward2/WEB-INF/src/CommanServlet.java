import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;

public class CommanServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		     response.setContentType("text/html");
			PrintWriter pw= response.getWriter();
			
			pw.write("<h1>CommanServlet----------starts</h1>");
			pw.write("<h1>CommanServlet----------ends</h1>");
			
			pw.flush();
			pw.close();
		}
}
