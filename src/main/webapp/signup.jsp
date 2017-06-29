<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action=signup method="post" name="sign">
		FirstName:<input type="text" name="firstname" /><br>
		<br> LastName:<input type="text" name="lastname" /><br>
		<br> mailid:<input type="text" name="mailid" /><br>
		<br> password:<input type="password" name="password" /><br>
		<br> MobileNumber:<input type="text" name="mobilenumber" /><br>
		<br> <input type="submit" value="submit">

	</form>
	${message }
</body>
</html>