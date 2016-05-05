<!DOCTYPE html>
<html lang="en">
<head>
  <title>NIIT ESTORE</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <link rel="stylesheet" type="text/css" href="./resources/css/custom.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
    <style>
  .carousel-inner > .item > img,
  .carousel-inner > .item > a > img {
      width: 70%;
      margin: auto;
  }
  </style>
 
</head>
<body>

<div class="container">
  <center><h2 style="color: blue;">NIIT Music E-Store</h2></center>
  <div>
  <ul class="nav nav-pills">
    <li><a href="index" >Home</a></li>
     <li><a href="product?t=all" >All Categories</a></li>
  </div>
  <div>
  <img src="./resources/images/1.jpg" class="img-circle" alt="Cinque Terre" width="304" height="236"> 
  </div>
   <table class="table table-striped">
    <tr>
    <th>PID</th>
    <th>PNAME</th>
    </tr>
        <tr ng-repeat="resource in names | filter:search">
            <td><%=request.getParameter("id") %></td>
            <td><%=request.getParameter("name") %></td>
            <td> </td>
        </tr>    
    </table>
  
</div>


</body>
</html>
