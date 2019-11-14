<%@ page import = "models.User"%>
<!doctype html>
<html lang="en">
 <head>
  <title>Document</title>
 </head>
 <body>
		<h1>Next1.jsp</h1>
		<% User user = (User)request.getAttribute("users"); %>
		Name: <%= user.getName()  %><br/><br/>
		Age: <%= user.getAge() %>
 </body>
</html>
