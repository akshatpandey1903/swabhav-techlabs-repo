<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
    <title>Admin Dashboard</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css" rel="stylesheet">
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
    <h1 class="mb-4 text-white text-center">Admin Dashboard</h1>
    <div class="row">
        <div class="col-md-3 mb-4">
            <div class="card text-center feature-card">
                <div class="card-body">
                    <i class="fas fa-user-plus fa-3x text-success mb-3"></i>
                    <h5>Add Customer</h5>
                    <a href="AdminHomeController?page=addCustomer" class="btn btn-success">Go</a>
                </div>
            </div>
        </div>

        <div class="col-md-3 mb-4">
            <div class="card text-center feature-card">
                <div class="card-body">
                    <i class="fas fa-university fa-3x text-primary mb-3"></i>
                    <h5>Add Account</h5>
                    <a href="AdminHomeController?page=addAccount" class="btn btn-primary">Go</a>
                </div>
            </div>
        </div>

        <div class="col-md-3 mb-4">
            <div class="card text-center feature-card">
                <div class="card-body">
                    <i class="fas fa-users fa-3x text-warning mb-3"></i>
                    <h5>View Customers</h5>
                    <a href="AdminHomeController?page=viewCustomers" class="btn btn-warning">Go</a>
                </div>
            </div>
        </div>

        <div class="col-md-3 mb-4">
            <div class="card text-center feature-card">
                <div class="card-body">
                    <i class="fas fa-money-check-alt fa-3x text-info mb-3"></i>
                    <h5>View Transactions</h5>
                    <a href="AdminHomeController?page=viewTransactions" class="btn btn-info">Go</a>
                </div>
            </div>
        </div>
    </div>
</div>


<div class="footer text-center py-3">
    <p>© 2025 ProBank | All Rights Reserved</p>
</div>
</body>
</html>


