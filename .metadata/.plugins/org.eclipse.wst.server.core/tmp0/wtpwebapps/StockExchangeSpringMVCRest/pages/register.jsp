<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
</head>
<body>

	${ message }<br>
	<form action="/StockExchangeSpringMVCRest/person/register"
		method="POST">

		Person Name: <input type="text" name="name"> <br> 
		<input type="submit" value="Register">
		
		<a href="/StockExchangeSpringMVCRest/pages/login.jsp">Go to login!</a>
	</form>

</body>
</html>