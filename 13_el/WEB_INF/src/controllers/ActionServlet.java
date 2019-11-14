package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.*;

public class ActionServlet extends HttpServlet{
      public void doGet(HttpServletRequest request,HttpServletResponse)throws IOException,ServletException{
`				Map<String,Integer> map = new HashMap<String,Integer>();
				map.put("abc#123",20);
				map.put("abc@123",40);

				request.setAttribute("aaa",map);

				request.getRequestDispatcher("next.jsp").forward(request,response);
	  }
}