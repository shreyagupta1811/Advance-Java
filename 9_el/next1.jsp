<!doctype html>
<html lang="en">
 <head>
  <title>Document</title>
 </head>
 <body>
		<h1>Next1 Jsp Page</h1>
		<% String uName=request.getParameter("nm"); %>
		<% String email =request.getParameter("em"); %>
		<% String password=request.getParameter("passw"); %>

		<% String[] food=request.getParameterValues("food"); %>

		UserName:<%= uName %></br>
		Email:<%= email %></br>
		Password:<%= password %>

		<% 
		if(food!=null){
			for(int i=0;i<food.length;i++){ %>
				Food Option <%= i+1 %>: <%= food[i] %><br />
	<% }} %>
 </body>
</html>
