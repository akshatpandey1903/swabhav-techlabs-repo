<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="LoginController" method="post">
		Username: <input type="text" name="username"><br><br>
		Password: <input type="text" name="password"><br><br>
		<button type="submit" value="customer" name="role">Login as Customer</button>
		<button type="submit" value="admin" name="role">Login as Admin</button>
	</form>	
</body>
</html>