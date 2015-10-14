<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
	
	${ message } <br>
	<form action="/StockExchangeSpringMVCRest/person/login"
		method="POST">

		Person Name: <input type="text" name="name"> <br> 
		<input type="submit" value="Login">
		
		<a href="/StockExchangeSpringMVCRest/pages/register.jsp">Go to registration!</a>
	</form>

</body>
</html>