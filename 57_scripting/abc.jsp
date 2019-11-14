<%@ page import ="abc.Student" %>

<!doctype html>
<html>
	<head>
		<title>Document</title>
	</head>
	<body>
		<h1>Abc JSP page</h1>
		<% Student std = (Student)request.getAttribute("Student"); %>
		Name:<%= std.name %></br></br>
		Age:<%= std.age %></br></br>
		College:<%= std.college %>
	</body>
</html>