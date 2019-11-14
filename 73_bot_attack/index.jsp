<!doctype html>
<html lang="en">
 <head>
  <link rel="stylesheet" type="text/css" href="css/index.css">
  <script src="js/index.js"></script>
  <title>Document</title>
 </head>
 <body>
		<h1>Index Page</h1>

		<%String errmsg = (String)request.getAttribute("err_msg"); %>
		<%if(errmsg!=null){%>
			<div style=" color: red">
				<%= errmsg %>
			</div>
		<%}%>

		<form action="register.do" id="regform">
		User Name:
		<input type="text" name="uname" id="uname" />
		<span id="unerr" class="errmsg">user name must be atleat 3 characters or more</span></br></br>

		Email:
		<input type="email" name="email" id="email" />
		<span id="emerr" class="errmsg">An invalid Email ..</span></br></br>

		Password:
		<input type="password" name="passw"  id="passw"/>
		<span id="perr" class="errmsg">password must be greater than 6 char or less than 12 characters</span></br></br>

		Repassword:
		<input type="password" name="repassw" id="repassw" />
		<span id="reperr" class="errmsg">repassword must be same as password</span></br></br>

		<input type="hidden" name="bottest" />

		<input type="submit" value="register" />

		</form>
 </body>
</html>
