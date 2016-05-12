<!DOCTYPE html>
<
<html lang="en">
<head>
  <title>AddToCart</title>
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
  <center><h2 style="color: black;">Shoe Clue's</h2></center>
  <div>
  <ul class="nav nav-pills">
     <li><a href="Product?t=all"  style="color:white">All Categories</a></li>
      <li><a href="Product?t=all"  style="color:white">Home</a></li>
  </div>
  <div>
  <img src="./resources/images/<%=request.getParameter("id") %>.jpg" class="thumbnail" alt="Cinque Terre" width="304" height="236"> 
  </div>
   <table class="table table-striped">
    <tr>
    <th>PID</th>
    <th>PNAME</th>
    <th>Description</th>
    <th>Price</th>
    </tr>
        <tr ng-repeat="resource in names | filter:search">
            <td><%=request.getParameter("id") %></td>
            <td><%=request.getParameter("name") %></td>
            <td><%=request.getParameter("desc") %></td>
            <td><%=request.getParameter("price") %></td>
            <td> <a href="">Add To Cart</a></td>
        </tr>    
    </table>
</div>
 <div>
    <h4 >Copy Rights @ NIIT LTD</h4>
    </div>
</body>
</html>
