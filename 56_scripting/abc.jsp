<!doctype html>
<html>
	<head>
		<title>Document</title>
	</head>
	<body>
		<h1>Abc JSP page</h1>
		<%=  request.getAttribute("name") %>
		</br></br>
		<% int age = (int)request.getAttribute("age"); %>
		<%= age %>
	</body>
</html>