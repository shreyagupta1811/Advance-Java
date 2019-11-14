<!doctype html>
<html lang="en">
 <head>
   <link rel="stylesheet" type="text/css" href="css/index.css" />
  <meta charset="UTF-8"> 
  <title>Document</title>
 </head>
 <body>
	<h1>INDEX PAGE</h1>
	<form action="register.do">
	<table>
		<tr>
			<td>UserName</td>
			<td>:</td>
			<td><input type="text" name="uname" /></td>
		</tr>
		<tr>
			<td>Age</td>
			<td>:</td>
			<td><input type="text" name="age" /></td>
		</tr>
		<tr>
			<td>College</td>
			<td>:</td>
			<td><input type="text" name="college" /></td>
		</tr>
		<tr>
			<td>Degree</td>
			<td>:</td>
			<td>
				<select name="degree">
					<option>BE</option>
					<option>ME</option>
					<option>BTech</option>
					<option>Mtech</option>
				</select>
			</td>
		</tr>
		<tr>
		    <td colspan="3"><input type="submit" value="register" /></td>
		</tr>
	</table>
 </body>
</html>
