import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;

public class CommanServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		    
			System.out.println("CommanServlet------Starts");

			response.setContentType("text/html");
			PrintWriter pw= response.getWriter();
			pw.flush();
			pw.close();

			System.out.println("hello world");
	
	}
}
/* even when we call flush and close than alse do get method complete its run before popout thats why in this code after calling
the flush(),close() hello world statement still print*/