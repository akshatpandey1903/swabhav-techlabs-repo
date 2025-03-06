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
	<title>View Transactions</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
	<link href="css/style.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
	<h2 class="text-center text-white mb-4">Transaction List</h2>

	<!-- Filter and Sorting Form -->
	<form action="ViewTransactionsController" method="get" class="mb-4">
		<div class="row">
			<div class="col-md-4">
				<label class="text-white">Transaction Type:</label>
				<select name="type" class="form-control">
					<option value="">All</option>
					<option value="deposit">Deposit</option>
					<option value="withdraw">Withdraw</option>
					<option value="transfer">Transfer</option>
				</select>
			</div>
			<div class="col-md-4">
				<label class="text-white">Sort By:</label>
				<select name="sort" class="form-control">
					<option value="transaction_date">Date</option>
					<option value="amount">Amount</option>
					<option value="type">Type</option>
				</select>
			</div>
			<div class="col-md-4">
				<label class="text-white">Order:</label>
				<select name="order" class="form-control">
					<option value="asc">Ascending</option>
					<option value="desc">Descending</option>
				</select>
			</div>
		</div>
		<button type="submit" class="btn btn-primary mt-3">Apply</button>
	</form>

	<table class="table table-dark table-striped">
		<thead>
		<tr>
			<th>Transaction ID</th>
			<th>Sender</th>
			<th>Receiver</th>
			<th>Type</th>
			<th>Amount</th>
			<th>Date</th>
		</tr>
		</thead>
		<tbody>
		<c:forEach var="transaction" items="${transactions}">
			<tr>
				<td>${transaction.transactionId}</td>
				<td>${transaction.senderId}</td>
				<td>${transaction.receiverId}</td>
				<td>${transaction.type}</td>
				<td>${transaction.amount}</td>
				<td>${transaction.transactionDate}</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<a href="AdminHomeController?page=home" class="btn btn-danger">Go Back</a>
</div>
<div class="footer text-center py-3">
	<p>© 2025 ProBank | All Rights Reserved</p>
</div>
</body>
</html>


