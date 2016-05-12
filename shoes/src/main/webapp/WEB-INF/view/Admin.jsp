<!DOCTYPE html>
<html lang="en">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
   <link rel="stylesheet" type="text/css" href="./resources/css/style.css" media="all" />
    <link rel="stylesheet" type="text/css" href="./resources/css/demo.css" media="all" />
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
 <% 
 response.setHeader("pragma", "no-cache");
 response.setHeader("Cache-control", "no-cache, no-store, must-revalidate");
 response.setHeader("Expires", "0");
 %>
</head>
 <center><h1 style="font-size: 40px; color: black">Shoe Clue's</h1></center>
<body>

<div class="container">
   <div>
  <ul class="nav nav-pills">
    <li><a href="AddProduct" style="color: white">Add Product</a></li>
     <li><a href="ViewProducts" style="color:white">ViewProducts</a></li>
      <li><a href='<c:url value="/j_spring_security_logout"/>' style="color:white">logout</a></li>
    </ul>
  </div>
 <div>       
  <center> <img src="<c:url value="/resources/images/admin.jpg"/>" style="width:500px; height:500px"></center>
</div>
</div>
 <div>
    <h4 >Copy Rights @ NIIT LTD</h4>
    </div>
  </body>
  </html>