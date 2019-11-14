<!doctype html>
<html lang="en">
 <head>
  <title>Document</title> 
  <link rel="stylesheet" type="text/css" href="css/index.css" />
  		<script src="js/index.js"></script>
 </head>
 <body>
		<table id="form">
				<tr>
						<td width="49%">UserName</td>
						<td width="2%">:</td>
						<td width="49%"><input type="text" id="uname" /></td>
				</tr>
				<tr>
						<td>Email</td>
						<td>:</td>
						<td><input type="email" id="eml" /></td>
				</tr>
				<tr>
						<td>Password</td>
						<td>:</td>
						<td><input type="password" id="pass" /></td>
				</tr>
				<tr>
					<td colspan="3" align="center"><input type="button" value="register" id="btn" onclick="sendRequest()" /></td>
				</tr>
		</table>
		<span id="xy">Show Users</span>
		<table  id="aaa">
				<thead>
					<tr>
							<th>User Id</th>
							<th>User Name</th>
							<th>Email</th>
							<th>Password</th>
					</tr>
				</thead>
				<tbody id="rec">
				
				</tbody>
		</table> 

 </body>
</html>
