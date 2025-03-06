<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
   <meta charset="UTF-8">
   <meta name="viewport" content="width=device-width, initial-scale=1.0">
   <title>Home</title>
   <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
   <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css" rel="stylesheet">
   <link href="css/style.css" rel="stylesheet">
</head>
<body>
<div class="navbar d-flex justify-content-between px-5 py-3">
   <h2>🌿 ProBank</h2>
   <div>
       <a href="HomeController?page=home"><i class="fas fa-home"></i> Home</a>
       <a href="HomeController?page=login"><i class="fas fa-sign-in-alt"></i> Login</a>
       <a href="#"><i class="fas fa-info-circle"></i> About</a>
   </div>
</div>


<div class="container mt-5">
   <h1 class="mb-5 text-white text-center">Welcome to  Swabhav Bank</h1>
   <div class="row">
       <div class="col-md-4 mb-4">
           <div class="card feature-card">
               <div class="card-body text-center">
                   <i class="fas fa-user-plus fa-3x text-success mb-3"></i>
                   <h5 class="card-title">Register</h5>
                   <p>Create your banking account easily.</p>
                   <a href="HomeController?page=register" class="btn btn-success"><i class="fas fa-user-plus"></i> Register</a>
               </div>
           </div>
       </div>
       <div class="col-md-4 mb-4">
           <div class="card feature-card">
               <div class="card-body text-center">
                   <i class="fas fa-sign-in-alt fa-3x text-primary mb-3"></i>
                   <h5 class="card-title">Login</h5>
                   <p>Access your account anytime.</p>
                   <a href="HomeController?page=login" class="btn btn-primary"><i class="fas fa-sign-in-alt"></i> Login</a>
               </div>
           </div>
       </div>
       <div class="col-md-4 mb-4">
           <div class="card feature-card">
               <div class="card-body text-center">
                   <i class="fas fa-university fa-3x text-warning mb-3"></i>
                   <h5 class="card-title">Our Services</h5>
                   <p>Explore our online banking features.</p>
                   <a href="#" class="btn btn-warning">Learn More</a>
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





