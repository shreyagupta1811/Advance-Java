<!doctype html>
<html lang="en">
 <head>
  <meta charset="UTF-8">
  <title>Document</title>
 </head>
 <body>
		<h1>Next Page</h1>
		<% String uName = request.getParameter("uname"); %>
		<% String email = request.getParameter("email"); %>
		<% String password = request.getParameter("passw"); %>

		UserName:<%= uName %></br>
		Email:<%= email %></br>
		Password:<%= password %></br>
 </body>
</html>
