<%@ page import = "java.util.Date" %>
<!doctype html>
<html lang="en">
 <head>
  <meta charset="UTF-8">
  <title>Document</title>
 </head>
 <body>
	<h1>JSP page --------scripting:directive</h1>

	<% Integer i = 12; %>
	<%= i %>
	</br></br>
	<% String s = "mohan";  %>
	<%= s %>
	</br></br>
	<% Date date = new Date(); %>
	<%= date %>
	<h1>#################################</h1>
 </body>
</html>
