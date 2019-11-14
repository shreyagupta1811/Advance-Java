import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class AbcServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
			HttpSession session = request.getSession();

			Cookie cookie1= new Cookie("abc","123");
			Cookie cookie2 = new Cookie("mno","234");
			Cookie cookie3 = new Cookie("xyz","567");

			cookie2.setMaxAge(0);
			cookie3.setMaxAge(20);
			
			response.addCookie(cookie1);
			response.addCookie(cookie2);
			response.addCookie(cookie3);

              response.setContentType("text/html");
			  PrintWriter pw = response.getWriter();

			pw.write("<!doctype html>");
			pw.write("<html lang='en'>");
			pw.write("<head>");
			pw.write("<title>Document</title>");
			pw.write("</head>");
			pw.write("<body>");
		   pw.write("<h1>One PAGE</h1>");
		   pw.write("<a href='xyz.do'>THE link</a>");
			pw.write("</body>");
			pw.write("</html>");

			pw.flush();
			pw.close();


	}
}