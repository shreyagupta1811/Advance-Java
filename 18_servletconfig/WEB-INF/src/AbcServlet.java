import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import javax.servlet.ServletConfig;

public class AbcServlet extends HttpServlet{
		public void doGet(HttpServletRequest request,HttpServletResponse response)  throws IOException, ServletException{
				ServletConfig  sconf= getServletConfig();
				
				System.out.println("AbcServletconfig: " +sconf);
				System.out.println("AbcServlet---->servletObject: " +this);
		}
}
/*here the first print statement is fpor the Servletconfig object and other will be for the Servlet class object that swhy it is 
accessed by the this*/