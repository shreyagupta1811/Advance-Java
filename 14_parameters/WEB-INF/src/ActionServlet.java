import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;

public class ActionServlet extends HttpServlet{
		public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
			response.setContentType("text/html");
			PrintWriter pw=response.getWriter();
			
		     String name=request.getParameter("nm");
			 String email=request.getParameter("eml");
			 String password=request.getParameter("pw");
			 String city=request.getParameter("city");
			String Address=request.getParameter("msg");

			pw.write("<h1>name:"+name+"</h1>");
			pw.write("<h1>email:"+ email+"</h1>");
			pw.write("<h1>password:"+password+"</h1>");
			pw.write("<h1>city:"+ city+"</h1>");
			pw.write("<h1>Address:"+Address+"</h1>");

			pw.flush();
			pw.close();
		}
}
