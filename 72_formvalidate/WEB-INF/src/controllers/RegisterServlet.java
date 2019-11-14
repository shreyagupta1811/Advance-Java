package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegisterServlet extends HttpServlet{
		public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{

		String userName = request.getParameter("uname");
		String email = request.getParameter("email");
		String password = request.getParameter("passw");
		String rePassword = request.getParameter("repassw");

		String errmessage = " ";
		Boolean flag = true;
		String nextpage = "index.jsp";

		if(userName.length()<3){
				flag=false;
				errmessage= errmessage + "user name must be atleat 3 character or more";
		}

		Pattern p = Pattern.compile("^\\w+@[a-zA-Z_]+?\\.[a-zA-Z]{2,3}$");
		Matcher m = p.matcher(email);
		if(!m.matches()){
				flag=false;
				errmessage= errmessage + "an invalid email...";
		}

		int passwordLength = password.length();
			if( passwordLength<6 ||  passwordLength>12){
						flag=false;
						errmessage= errmessage + "your password must be greater than 6 and less than 12 character";
		}

		if(!password.equals(rePassword)){
				flag = false;
				errmessage= errmessage + "your repassword must be same as your password";
		}

			if(flag){
					nextpage="success.jsp";
			}
			else{
					request.setAttribute("err_msg",errmessage);
			}
			request.getRequestDispatcher(nextpage).forward(request,response);
		}
}