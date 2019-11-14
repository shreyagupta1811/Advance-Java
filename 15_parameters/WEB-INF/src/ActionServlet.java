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

			  String food1=request.getParameter("food");
			  String food2=request.getParameter("food");
			  String food3=request.getParameter("food");

			 String city1=request.getParameter("ct");
			 String city2=request.getParameter("ct");
			 String city3=request.getParameter("ct");

			String Address=request.getParameter("msg");

			pw.write("<h1>name:"+name+"</h1>");
			pw.write("<h1>email:"+ email+"</h1>");
			pw.write("<h1>password:"+password+"</h1>");

			pw.write("<h1>Food1:"+ food1+"</h1>");
			pw.write("<h1>Food2:"+ food2+"</h1>");
			pw.write("<h1>Food3:"+ food3+"</h1>");

			pw.write("<h1>city1:"+ city1+"</h1>");
			pw.write("<h1>city2:"+ city2+"</h1>");
			pw.write("<h1>city3:"+ city3+"</h1>");

			pw.write("<h1>Address:"+Address+"</h1>");

			pw.flush();
			pw.close();
		}
}
/*here we we select multiple check box or multiplr dropdown than and call getParameter() three time on three different 
variable than it show first selected items three time on the html page for this we have to use the getParameterValue() to get the correct 
selected option*/
