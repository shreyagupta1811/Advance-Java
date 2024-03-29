<%@ page import ="java.util.ArrayList , models.User"%>
<!doctype html>
<html lang="en">
 <head>
  <meta charset="UTF-8">
   <link rel="stylesheet" type="text/css" href="css/records.css" />
  <link rel="stylesheet" type="text/css" href="css/comman.css" />
  <title>Document</title>
 </head>
 <body>
		<h1>Records Page</h1>
		</hr>

		<% ArrayList<User> users = (ArrayList)request.getAttribute("users"); %>
		<div>
			<table>
			    <thead>
					<tr>
							<th>User Id</th>
							<th>User Name</th>
							<th>Email</th>
							<th>Password</th>
					</tr>
				</thead>
				<tbody>
						<% for(User user: users) { %>
							<tr>
									<td><%= user.getUserId() %></td>
									<td><%= user.getUserName() %></td>
									<td><%= user.getEmail() %></td>
									<td><%= user.getPassword() %></td>
							</tr>
						<% }%>
				</tbody>
			</table>
		</div>
 </body>
</html>
