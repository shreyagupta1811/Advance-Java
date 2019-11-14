import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;

public class AbcServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
				ServletContext sc = getServletContext();
				ServletConfig sf = getServletConfig();

				System.out.println("AbcServlet----->ServletContext" +sc);
				System.out.println("AbcServlet----->ServletConfig" +sf);
				System.out.println("AbcServlet----->Servletclass Object" +this);

	}
}