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
			
			String host=request.getHeader("host");
			String accept=request.getHeader("Accept");
			String acceptlan=request.getHeader("Accept-Language");
			String acceptencod=request.getHeader("Accept-Encoding");
			String charset=request.getHeader("charset");

			pw.write("<h1>Host name:"+host+"</h1>");
			pw.write("<h1>accept:"+accept+"</h1>");
			pw.write("<h1>accept-language:"+acceptlan+"</h1>");
			pw.write("<h1>accept-encoding:"+ acceptencod+"</h1>");
			pw.write("<h1>charset:"+charset+"</h1>");

			pw.flush();
			pw.close();
		}
}
//here we are printing or showing the request header that are send to the server by the browser along with the request this was 
//shown either on server page or on the serverscreen.