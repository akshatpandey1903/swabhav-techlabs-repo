<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.aurionpro.entity.User" %>
<%
	User user = (User) session.getAttribute("user");
	if (user == null || !user.getRole().equals("customer")) {
		response.sendRedirect("login.jsp");
		return;
	}
	String success = request.getParameter("success");
%>
<!DOCTYPE html>
<html>
<head>
	<title>Edit Profile</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
	<link href="css/style.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
	<h2 class="text-center text-white mb-4">Edit Profile</h2>
	<% if ("true".equals(success)) { %>
	<div class="alert alert-success text-center">
		Profile updated successfully!
	</div>
	<% } %>
	<form action="EditProfileController" method="post">
		<div class="mb-3">
			<label>Email</label>
			<input type="email" name="email" class="form-control" value="<%= user.getEmail() %>" required>
		</div>
		<div class="mb-3">
			<label>Password</label>
			<input type="password" name="password" class="form-control" required>
		</div>
		<button type="submit" class="btn btn-primary">Update</button>
		<a href="CustomerHomeController?page=home" class="btn btn-danger">Go Back</a>
	</form>
</div>
<div class="footer text-center py-3">
	<p>© 2025 ProBank | All Rights Reserved</p>
</div>
</body>
</html>


