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
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add Account</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
</head>
<body>
<div class="navbar d-flex justify-content-between px-5 py-3 bg-dark text-white">
    <h2>🌿 ProBank</h2>
    <div>
        <span class="me-3">Welcome, <%= user.getUsername() %></span>
        <a href="LogoutController" class="text-danger"><i class="fas fa-sign-out-alt"></i> Logout</a>
    </div>
</div>

<div class="container mt-5">
    <h1 class="mb-4 text-center text-white">Add Account</h1>

    <c:if test="${not empty error}">
        <div class="alert alert-danger text-center">${error}</div>
    </c:if>
    <c:if test="${not empty success}">
        <div class="alert alert-success text-center">${success}</div>
    </c:if>

    <div class="card p-4">
        <form action="AddAccountController" method="post">
            <div class="mb-3">
                <label class="form-label">Customer ID:</label>
                <input type="number" class="form-control" name="userId" placeholder="Enter Customer ID" required>
            </div>
            <div class="mb-3">
                <label class="form-label">Initial Balance:</label>
                <input type="number" class="form-control" name="balance" placeholder="Enter Initial Balance" required>
            </div>
            <div class="d-flex justify-content-between">
                <button type="submit" class="btn btn-primary">Create Account</button>
                <a href="AdminHomeController?page=home" class="btn btn-danger">Go Back</a>
            </div>
        </form>
    </div>
</div>

<div class="footer text-center py-3">
    <p>© 2025 ProBank | All Rights Reserved</p>
</div>
</body>
</html>


