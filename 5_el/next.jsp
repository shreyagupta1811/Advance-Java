<!doctype html>
<html lang="en">
 <head>
  <title>Document</title>
 </head>
 <body>
		<h1>Next Page</h1>
		<%  pageContext.setAttribute("mno", true);  %>

		</br></br>

		######   ${pageScope.mno}

		</br></br>

		%%%%%  ${requestScope.mno}

		</br></br>

		@@@@ ${sessionScope.mno}

		</br></br>

		****** ${applicationScope.mno}
 </body>
</html>
