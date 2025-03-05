<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
<title>Login</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
	<h2 class="text-center text-white mb-4">Login</h2>

	<form action="LoginController" method="post">
		<div class="mb-3">
			<label>Username</label>
			<input type="text" name="username" class="form-control" required>
		</div>

		<div class="mb-3">
			<label>Password</label>
			<input type="password" name="password" class="form-control" required>
		</div>

		<div class="mb-3">
			<label>Select Role</label>
			<select name="role" class="form-select" required>
				<option value="customer">Customer</option>
				<option value="admin">Admin</option>
			</select>
		</div>

		<% if (request.getAttribute("error") != null) { %>
		<div class="alert alert-danger">
			<%= request.getAttribute("error") %>
		</div>
		<% } %>

		<button type="submit" class="btn btn-primary w-100">Login</button>
	</form>
</div>
</body>
</html>



