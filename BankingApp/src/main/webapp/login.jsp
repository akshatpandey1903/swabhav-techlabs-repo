<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
   <meta charset="UTF-8">
   <meta name="viewport" content="width=device-width, initial-scale=1.0">
   <title>Login</title>
   <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
   <link href="css/style.css" rel="stylesheet">
</head>
<body>
<div class="container login-box mt-5">
   <h2>🌿 ProBank Login</h2>
   <form action="LoginController" method="post">
       <div class="mb-3">
           <label>Username:</label>
           <input type="text" class="form-control" name="username" required>
       </div>
       <div class="mb-3">
           <label>Password:</label>
           <input type="password" class="form-control" name="password" required>
       </div>
       <div class="mb-3">
           <label>Select Role:</label>
           <select class="form-select" name="role">
               <option value="customer">Customer</option>
               <option value="admin">Admin</option>
           </select>
       </div>
       <button type="submit" class="btn btn-success w-100">Login</button>
       <% if (request.getParameter("error") != null) { %>
       <div class="alert alert-danger mt-3">
           Invalid Username, Password, or Role!
       </div>
       <% } %>
   </form>
</div>
</body>
</html>


