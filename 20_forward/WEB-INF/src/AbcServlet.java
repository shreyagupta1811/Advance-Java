import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;

public class AbcServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
			System.out.println("AbcServlet----------Start");
			
			RequestDispatcher  rd = request.getRequestDispatcher("cmn.do");
			rd.forward(request,response);

			System.out.println("AbcServlet----------ends");
	}
}
/*here there is one exception that when we print on ServerConsole than forward method does not work properly and after CommanServlet
control comes to AbcServlet again*/
