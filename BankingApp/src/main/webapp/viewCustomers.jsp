<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.aurionpro.entity.User" %>
<%
	User user = (User) session.getAttribute("user");
	if (user == null || !user.getRole().equals("admin")) {
		response.sendRedirect("login.jsp");
		return;
	}
%>
<!DOCTYPE html>
<html>
<head>
	<title>View Customers</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
	<link href="css/style.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
	<h2 class="text-center text-white mb-4">Customer List</h2>

	<form action="ViewCustomersController" method="GET" class="mb-3 d-flex justify-content-between">
		<div>
			<input type="text" name="search" value="${search}" placeholder="Search by Username" class="form-control d-inline-block w-50">
			<button type="submit" class="btn btn-primary">Search</button>
		</div>
		<div>
			<select name="sort" class="form-select d-inline-block w-50">
				<option value="">Sort By</option>
				<option value="username" ${sort == "username" ? "selected" : ""}>Username</option>
			</select>
			<button type="submit" class="btn btn-warning">Sort</button>
		</div>
	</form>

	<table class="table table-dark table-striped table-hover">
	<thead>
	<tr>
		<th>User ID</th>
		<th>Username</th>
		<th>Email</th>
		<th>Created At</th>
		<th>Bank Accounts</th>
	</tr>
	</thead>
	<tbody>
	<c:forEach var="customer" items="${customers}">
		<tr>
			<td>${customer.userId}</td>
			<td>${customer.username}</td>
			<td>${customer.email}</td>
			<td>${customer.createdAt}</td>
			<td>
				<c:choose>
					<c:when test="${not empty customerAccounts[customer.userId]}">
						<c:forEach var="account" items="${customerAccounts[customer.userId]}">
							Account ID: ${account.accountNo}, Balance: ${account.balance} <br>
						</c:forEach>
					</c:when>
					<c:otherwise>
						<span class="text-danger">No Account Available</span>
					</c:otherwise>
				</c:choose>
			</td>
		</tr>
	</c:forEach>
	</tbody>
</table>



	<a href="AdminHomeController?page=home" class="btn btn-danger mt-3">Go Back</a>
</div>
<div class="footer text-center py-3">
	<p>© 2025 ProBank | All Rights Reserved</p>
</div>



</body>
</html>

 
