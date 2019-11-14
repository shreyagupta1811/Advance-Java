<!doctype html>
<html lang="en">
 <head>
  <title>Document</title>
 </head>
 <body>
		<h1>Index Page</h1>

		<% String errMsg = (String)request.getAttribute("err_msg"); %>
		<% if(errMsg!=null){ %>
				<div style="color:red">
					<%= errMsg %>
				</div>
		<%}%>

		<form action="register.do">
				Name:<input type="text" name="uname" /></br></br>
				Email: <input type="text" name="email" /></br></br>
				Password: <input type="password" name="passw" /></br></br>
				Repassword: <input type="password" name="repassw" /></br></br>
				<input type="submit" value="Register" />
		</form>
 </body>
</html>
