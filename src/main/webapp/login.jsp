<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="#FF0000">


	<div style="color: #00FF00">
		<h2>welcome to login</h2>

	</div>


	<form action="signin" method="get" name="log">
		mailid:<input type="text" name="mailid" /><br>
		 password:<input type="password" name="password" /><br> 
		 <input type="submit" value="login" />
	</form>
	${message}
	<a href="signup.jsp">register here</a>




</body>
</html>