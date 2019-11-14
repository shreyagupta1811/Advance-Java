<%@ page import = "models.* "%>
<!doctype html>
<html lang="en">
 <head>
  <title>Document</title>
 </head>
 <body>
		<h1>Next1 page</h1>
		<% User user = (User)request.getAttribute("user"); %>
		Name:<%= user.getName() %><br/><br/>
		Age: <%= user.getAge() %><br/><br/>
		City: <%= user.getAddress().getCity().getCityName() %><br/><br/>
		State: <%= user.getAddress().getState().getStateName() %><br/><br/>
 </body>
</html>
