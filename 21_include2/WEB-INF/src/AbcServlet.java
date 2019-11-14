import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;

public class AbcServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
			  response.setContentType("text/html");
			PrintWriter pw= response.getWriter();
			
			pw.write("<h1>AbcServlet----------starts</h1>");
			RequestDispatcher  rd = request.getRequestDispatcher("cmn.do");
			rd.include(request,response);
			pw.write("<h1>AbcServlet----------ends</h1>");

			pw.flush();
			pw.close();
	}
}
