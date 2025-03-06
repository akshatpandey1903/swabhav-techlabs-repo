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
    <title>Add Customer</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
    <style>
        /* Custom styles for better alignment and design */
        .navbar {
            background: rgba(255, 255, 255, 0.1);
            backdrop-filter: blur(10px);
            box-shadow: 0 4px 10px rgba(0, 0, 0, 0.2);
            border-bottom: 1px solid rgba(255, 255, 255, 0.1);
        }
        .navbar h2 {
            color: white;
            letter-spacing: 2px;
            font-weight: bold;
            margin: 0;
        }
        .navbar a {
            color: white;
            text-decoration: none;
            font-weight: bold;
            transition: color 0.3s ease;
        }
        .navbar a:hover {
            color: #bbe1fa; /* Light Blue Hover */
        }
        .card {
        	max-width: 400px;
        	margin: 0 auto;
            background: rgba(255, 255, 255, 0.1);
            backdrop-filter: blur(10px);
            border-radius: 15px;
            box-shadow: 0 4px 15px rgba(0, 0, 0, 0.2);
            color: white;
        }
        .form-control {
            background: rgba(255, 255, 255, 0.1);
            border: 1px solid rgba(255, 255, 255, 0.2);
            color: white;
        }
        .form-control:focus {
            background: rgba(255, 255, 255, 0.2);
            border-color: #4ED037;
            box-shadow: 0 0 5px rgba(78, 208, 55, 0.5);
        }
        .btn-success {
            background-color: #4ED037;
            border: none;
            transition: background-color 0.3s ease;
        }
        .btn-success:hover {
            background-color: #3aa822;
        }
        .btn-danger {
            background-color: #dc3545;
            border: none;
            transition: background-color 0.3s ease;
        }
        .btn-danger:hover {
            background-color: #c82333;
        }
        .footer {
            background: rgba(0, 0, 0, 0.2);
            border-top: 1px solid rgba(255, 255, 255, 0.1);
        }
    </style>
</head>
<body>
    <!-- Navbar -->
    <div class="navbar d-flex justify-content-between px-5 py-3">
        <h2>🌿 ProBank</h2>
        <div>
            <span class="me-3">Welcome, <%= user.getUsername() %></span>
            <a href="LogoutController" class="text-danger"><i class="fas fa-sign-out-alt"></i> Logout</a>
        </div>
    </div>

    <!-- Main Content -->
    <div class="container mt-5">
        <h1 class="mb-4 text-center text-white">Add Customer</h1>
        <c:if test="${not empty error}">
            <div class="alert alert-danger text-center">${error}</div>
        </c:if>
        <c:if test="${not empty success}">
            <div class="alert alert-success text-center">${success}</div>
        </c:if>

        <!-- Form Card -->
        <div class="card p-4">
            <form action="AddCustomerController" method="post">
                <div class="mb-3">
                    <label for="username" class="form-label">Username:</label>
                    <input type="text" class="form-control" id="username" name="username" placeholder="Enter Username" required>
                </div>
                <div class="mb-3">
                    <label for="email" class="form-label">Email:</label>
                    <input type="email" class="form-control" id="email" name="email" placeholder="Enter Email" required>
                </div>
                <div class="mb-3">
                    <label for="password" class="form-label">Password:</label>
                    <input type="password" class="form-control" id="password" name="password" placeholder="Enter Password" required>
                </div>
                <div class="d-flex justify-content-between">
                    <button type="submit" class="btn btn-success">Add Customer</button>
                    <a href="AdminHomeController?page=home" class="btn btn-danger">Go Back</a>
                </div>
            </form>
        </div>
    </div>

    <!-- Footer -->
    <div class="footer text-center py-3">
        <p>© 2025 ProBank | All Rights Reserved</p>
    </div>
</body>
</html>

