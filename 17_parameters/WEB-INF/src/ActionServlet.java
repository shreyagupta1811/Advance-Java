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
			 String food=request.getParameter("food");
			 String  city=request.getParameter("ct");

			pw.write("<h1>name:"+name+"</h1>");
			pw.write("<h1>Food:"+ food+"</h1>");
			pw.write("<h1>City:"+city+"</h1>");

			pw.flush();
			pw.close();
		}
}
/* here in this code we have to observe that input type text -if u not fill it in a form than also its parameter created and null string but if u 
not select any of the check box,radio button,dropdown than there is no parameter form for this and it store null in text page*/


