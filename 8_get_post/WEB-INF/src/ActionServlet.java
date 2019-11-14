import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import javax.servlet.ServletException;
import java.io.PrintWriter;
import java.util.Date;

public class ActionServlet extends HttpServlet{
		public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
					response.setContentType("text/html");
					PrintWriter pw=response.getWriter();
					Date date=new Date();

					pw.write("<html>");
					pw.write("<head>");
					pw.write("<title>hello</title>");
					pw.write("<head>");
					pw.write("<body>");
					pw.write("<h1>"+date+"</h1>");
					pw.write("</body>");
					pw.write("</html>");

					pw.flush();
					pw.close();
		}
}
/* here the request from index page is gone through the get method but here we overwrite the post method so it generate the error
of status code 405 i.e method not found*/