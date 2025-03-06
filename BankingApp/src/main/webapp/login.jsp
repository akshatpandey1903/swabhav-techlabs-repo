<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
    <style>
        /* Custom styles to improve the layout */
        .login-container {
            max-width: 400px; /* Limit the width of the form */
            margin: 0 auto; /* Center the form horizontally */
            padding: 20px;
            background-color: #f8f9fa; /* Light background color */
            border-radius: 8px; /* Rounded corners */
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1); /* Subtle shadow */
        }
        .login-container h2 {
            color: #333; /* Darker text color for the heading */
        }
        body {
            background-color: #e9ecef; /* Light gray background for the page */
            padding-top: 50px; /* Add some padding at the top */
        } 
    </style>
</head>
<body>

    <div class="container">
        <div class="login-container">
            <h2 class="text-center mb-4">Login</h2>
            <form action="LoginController" method="post">
                <div class="mb-3">
                    <label for="username" class="form-label">Username</label>
                    <input type="text" id="username" name="username" class="form-control" required>
                </div>
                <div class="mb-3">
                    <label for="password" class="form-label">Password</label>
                    <input type="password" id="password" name="password" class="form-control" required>
                </div>
                <div class="mb-3">
                    <label for="role" class="form-label">Select Role</label>
                    <select id="role" name="role" class="form-select" required>
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
        <a href="HomeController?page=home" class="btn btn-danger mt-3">Go Back</a>
    </div>
    
</body>
</html>

