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

			String[] food=request.getParameterValues("food");
			String[] city=request.getParameterValues("ct");
			 
			String Address=request.getParameter("msg");

			pw.write("<h1>name:"+name+"</h1>");
			pw.write("<h1>email:"+ email+"</h1>");
			pw.write("<h1>password:"+password+"</h1>");

			int i=1;
			for(String str:food){
					pw.write("<h1>Food"+i+":"+str+"</h1>");
					i++;
			}
	
			i=1;
			for(String str:city){
					pw.write("<h1>City"+i+":"+str+"</h1>");
					i++;
			}

			pw.write("<h1>Address:"+Address+"</h1>");

			pw.flush();
			pw.close();
		}
}
//by using getparameter value we can solve the probem of 15-parametr

