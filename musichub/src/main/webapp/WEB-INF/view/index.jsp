<!DOCTYPE html>
<html lang="en">
<head>
  <title>NIIT ESTORE</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <link rel="stylesheet" type="text/css" href="css/custom.css">
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
    <li><a href="AboutUs" >About Us</a></li>
    <li><a href="index" >Home</a></li>
     <li><a href="product.jsp?name=all categories" >All Categories</a></li>
    <li><a href="SignUp" >Sign Up</a></li>
    <li> <a href="Login" >Log In</a></li>
  </div>
    <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
      <li data-target="#myCarousel" data-slide-to="3"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">
      <div class="item active">
        <img src="images/1.jpg" alt="Chania" width="460" height="345">
      </div>

      <div class="item">
        <img src="images/2.jpg" alt="Chania" width="460" height="345">
      </div>
    
      <div class="item">
        <img src="images/3.jpg" alt="Flower" width="460" height="345">
      </div>

      <div class="item">
        <img src="images/4.png" alt="Flower" width="460" height="345">
      </div>
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
<div class="row">
    <div class="col-md-4">
      <a href="product.jsp?name=voilon" class="thumbnail">
        
        <img src="images/voilon.jpg" alt="Pulpit Rock" style="width:150px;height:150px">
      </a>
    </div>
    <div class="col-md-4">
      <a href="product.jsp?name=drums" class="thumbnail">
        
        <img src="images/drums.jpg" alt="Moustiers Sainte Marie" style="width:150px;height:150px">
      </a>
    </div>
    <div class="col-md-4">
      <a href="product.jsp?name=guitar" class="thumbnail">
        
        <img src="images/guitar.jpg" alt="Cinque Terre" style="width:150px;height:150px">
      </a>
    </div>
  </div>
  
</div>


</body>
</html>
