<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Register</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
    <h1 class="text-center text-white">Register</h1>
    <% String error = (String) request.getAttribute("error"); %>
    <% if (error != null) { %>
    <div class="alert alert-danger">
        <%= error %>
    </div>
    <% } %>
    <form action="RegisterController" method="post">
        <div class="mb-3">
            <label class="form-label text-white">Username</label>
            <input type="text" class="form-control" name="username" placeholder="Enter Username">
        </div>
        <div class="mb-3">
            <label class="form-label text-white">Email</label>
            <input type="email" class="form-control" name="email" placeholder="Enter Email">
        </div>
        <div class="mb-3">
            <label class="form-label text-white">Password</label>
            <input type="password" class="form-control" name="password" placeholder="Enter Password">
        </div>
        <div class="mb-3">
            <label class="form-label text-white">Role</label>
            <select class="form-control" name="role">
                <option value="customer">Customer</option>
            </select>
        </div>
        <button type="submit" class="btn btn-success">Register</button>
    </form>
    <a href="HomeController?page=login" class="btn btn-primary mt-3">Back to Login</a>
</div>
</body>
</html>



