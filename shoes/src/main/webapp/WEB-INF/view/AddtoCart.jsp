<!DOCTYPE html>
<
<html lang="en">
<head>
 <% 
 response.setHeader("pragma", "no-cache");
 response.setHeader("Cache-control", "no-cache, no-store, must-revalidate");
 response.setHeader("Expires", "0");
 %>
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
      cursor: pointer;
      border: 5px solid  white;
      -webkit-box-shadow: 0 0 22px rgba(0,0,0,.5);
      
  }
  figure img {
  
  -webkit-transition: all 1.3s;
  }
  figure:hover img
  {
  
  -webkit-transform: scale(2.0);
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
  <figure>
  <img src="./resources/images/<%=request.getParameter("id") %>.jpg" class="thumbnail" alt="Cinque Terre" width="304" height="236">
  </figure> 
  </div>
   <table class="table table-striped">
    <tr>
    <th>PID</th>
    <th>PNAME</th>
    <th>Manufacturer</th>
    <th>Price(INR)</th>
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
