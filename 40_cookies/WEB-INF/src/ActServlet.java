import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class ActServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
			HttpSession session = request.getSession();

			Cookie cookie1 = new Cookie("abc" , "123");
			Cookie cookie2 = new Cookie("def" , "234");
			Cookie cookie3 = new Cookie("ghi" , "345");
			response.addCookie(cookie1);
			response.addCookie(cookie2);
			response.addCookie(cookie3);
			
	}
}


