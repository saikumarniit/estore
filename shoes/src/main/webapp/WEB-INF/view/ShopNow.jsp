<!DOCTYPE html>
<html lang="en">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
  <title>Shop Now</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
  <link rel="stylesheet" type="text/css" href="./resources/css/style.css" media="all" />
    <link rel="stylesheet" type="text/css" href="./resources/css/demo.css" media="all" />
     <style>
  .carousel-inner > .item > img,
  .carousel-inner > .item > a > img {
      width: 70%;
      margin: auto;
  }
  </style>
</head>
<center><h1 style="font-size: 40px; color: black">Shoe Clue's</h1></center>
<body>

<div class="container">
 <div>
  <ul class="nav nav-pills">
    <li><a href="AddProduct" style="color: white">Add Product</a></li>
     <li><a href="ViewProducts" style="color:white">ViewProducts</a></li>
              </ul>
              </div>
  <div class="row">
    <div class="col-md-4">
      <a href="ShopLogin" class="thumbnail">
        <p>Buy @ INR 499.</p>    
        <img src="<c:url value="/resources/images/one.jpg"/>"  style="width:400px; height:300px">
      </a>
    </div>
   <div class="col-md-4">
      <a href="ShopLogin" class="thumbnail">
        <p>Buy @ INR 699.</p>    
        <img src="<c:url value="/resources/images/two.jpg"/>"  style="width:400px; height:300px">
      </a>
    </div>
    <div class="col-md-4">
      <a href="ShopLogin" class="thumbnail">
        <p>Buy @ INR 345.</p>    
        <img src="<c:url value="/resources/images/three.jpg"/>"  style="width:400px; height:300px">
      </a>
    </div>
    <div class="col-md-4">
      <a href="ShopLogin" class="thumbnail">
        <p>Buy @ INR 800.</p>    
        <img src="<c:url value="/resources/images/five.jpg"/>"  style="width:400px; height:300px">
      </a>
    </div>
    <div class="col-md-4">
      <a href="ShopLogin" class="thumbnail">
        <p>Buy @ INR 1299.</p>    
        <img src="<c:url value="/resources/images/six.jpg"/>"  style="width:400px; height:300px">
      </a>
    </div>
    <div class="col-md-4">
       <a href="ShopLogin" class="thumbnail">
        <p>Buy @ INR 900.</p>    
        <img src="<c:url value="/resources/images/fourteen.jpg"/>"  style="width:400px; height:300px">
      </a>
    </div>
    <div class="col-md-4">
       <a href="ShopLogin" class="thumbnail">
        <p>Buy @ INR 1299.</p>    
        <img src="<c:url value="/resources/images/eight.jpg"/>"  style="width:400px; height:300px">
      </a>
    </div>
    <div class="col-md-4">
       <a href="ShopLogin" class="thumbnail">
        <p>Buy @ INR 1999.</p>    
        <img src="<c:url value="/resources/images/none.jpg"/>"  style="width:400px; height:300px">
      </a>
    </div>
    <div class="col-md-4">
       <a href="ShopLogin" class="thumbnail">
        <p>Buy @ INR 777.</p>    
        <img src="<c:url value="/resources/images/ten.jpg"/>"  style="width:400px; height:300px">
      </a>
    </div>
    <div class="col-md-4">
      <a href="ShopLogin" class="thumbnail">
        <p>Buy @ INR 640.</p>    
        <img src="<c:url value="/resources/images/eleven.jpeg"/>"  style="width:400px; height:300px">
      </a>
    </div>
  </div>
</div>
</body>
</html>
