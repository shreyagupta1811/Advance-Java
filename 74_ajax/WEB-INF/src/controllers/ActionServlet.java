package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class ActionServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
			System.out.println("##########");
				try{
					response.getWriter().write("Chandrayan-2");
					//System.out.println("@@@@@@@");
				}catch(Exception e){
						e.printStackTrace();
				}
			System.out.println("###########");
	}
}
