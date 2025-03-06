<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
	<title>Passbook</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
	<link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css" rel="stylesheet">
	<link href="css/style.css" rel="stylesheet">
	<style type="text/css">
		.col-md-6{
			margin: 0 auto;
		}
	</style>
</head>
<body>
<div class="container mt-5">
	<h2 class="text-center text-white mb-4">Passbook</h2>
	<c:if test="${not empty message}">
		<div class="alert alert-danger text-center">${message}</div>
	</c:if>
	<c:if test="${empty message}">
	<div class="card bg-dark text-white text-center mb-4">
		<div class="card-body">
			<h5>Current Balance</h5>
			<h3 class="text-success">&#8377; ${balance}</h3>
		</div>
	</div>

	<div class="row mb-3" >
		<div class="col-md-6">
			<form method="get" action="ViewPassbookController">
				<input type="hidden" name="page" value="viewPassbook">
				<select class="form-select" name="filter">
					<option value="">All Transactions</option>
					<option value="deposit" ${filter == 'deposit' ? 'selected' : ''}>Deposit</option>
					<option value="withdraw" ${filter == 'withdraw' ? 'selected' : ''}>Withdraw</option>
					<option value="transfer" ${filter == 'transfer' ? 'selected' : ''}>Transfer</option>
				</select>
				<button type="submit" class="btn btn-primary mt-2">Filter</button>
			</form>
		</div>
	</div>
	<table class="table table-dark table-striped table-hover">
		<thead>
		<tr>
			<th>Transaction ID</th>
			<th>Type</th>
			<th>Amount</th>
			<th>Description</th>
			<th>Date</th>
		</tr>
		</thead>
		<tbody>
		<c:forEach var="transaction" items="${transactions}">
			<tr>
				<td>${transaction.transactionId}</td>
				<td>${transaction.type}</td>
				<td>&#8377; ${transaction.amount}</td>
				<td>${transaction.description}</td>
				<td>${transaction.transactionDate}</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	</c:if>

	<a href="CustomerHomeController?page=home" class="btn btn-danger mt-3">Go Back</a>
</div>
<div class="footer text-center py-3">
	<p>© 2025 ProBank | All Rights Reserved</p>
</div>



</body>
</html>


