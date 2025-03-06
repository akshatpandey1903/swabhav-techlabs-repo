<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.aurionpro.entity.User" %>
<%
	User user = (User) session.getAttribute("user");
	if (user == null || !user.getRole().equals("customer")) {
		response.sendRedirect("login.jsp");
		return;
	}
%>
<!DOCTYPE html>
<html>
<head>
	<title>New Transaction</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
	<link href="css/style.css" rel="stylesheet">
	<style>
		.container{
			max-width: 400px;
		}
	</style>
</head>
<body>
<div class="container mt-5">
	<h2 class="text-center text-white mb-4">New Transaction</h2>
	<form action="TransactionController" method="post" class="p-4 bg-dark text-white rounded">
		<div class="mb-3">
			<label for="type" class="form-label">Transaction Type</label>
			<select class="form-select" name="type" id="type" required>
				<option value="" disabled selected>Select Type</option>
				<option value="deposit">Deposit</option>
				<option value="withdraw">Withdraw</option>
				<option value="transfer">Transfer</option>
			</select>
		</div>
		<div class="mb-3">
			<label for="receiverId" class="form-label">Receiver Account ID (For Transfer Only)</label>
			<input type="number" name="receiverId" class="form-control" placeholder="Receiver Account ID">
		</div>
		<div class="mb-3">
			<label for="amount" class="form-label">Amount</label>
			<input type="number" name="amount" class="form-control" placeholder="Enter Amount" required>
		</div>
		<div class="mb-3">
			<label for="description" class="form-label">Description</label>
			<input type="text" name="description" class="form-control" placeholder="Transaction Description">
		</div>
		<button type="submit" class="btn btn-primary w-100">Submit</button>
	</form>
	<a href="CustomerHomeController?page=home" class="btn btn-danger mt-3">Go Back</a>
</div>
<div class="footer text-center py-3">
	<p>© 2025 ProBank | All Rights Reserved</p>
</div>
</body>
</html>


