import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;

public class ActServlet extends HttpServlet{
	//String manager="vivek";
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException ,ServletException{
				response.setContentType("text/html");
				PrintWriter pw = response.getWriter();
				
				pw.write("<h1>"+getInitParameter("manager")+"</h1>");

				pw.flush();
				pw.close();
	}
}