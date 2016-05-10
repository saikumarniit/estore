<!DOCTYPE html>
<html lang="en">
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
 
</head>
<body>

<div class="container">
  <%@ include file="header.jsp" %>
   <div>
  <ul class="nav nav-pills">
    <li><a href="AboutUs" >About Us</a></li>
    <li><a href="index" >Home</a></li>
     <li><a href="Product" >All Categories</a></li>
    <li><a href="SignUp" >Sign Up</a></li>
  </div>
  <div  class="form">
    		<form id="contactform"> 
    			<p class="contact"><label for="email">Email</label></p> 
    			<input id="email" name="email" placeholder="example@domain.com" required="" type="email"> 
                
               <label for="password"> password</label></p> 
    			<input type="password" id="password" name="password" required=""> 
            <input class="buttom" name="submit" id="submit" tabindex="5" value="Log In" type="submit"/>
             <input class="buttom" name="submit" id="submit" tabindex="5" value="Reset" type="reset"/>
   </form> 
</div>
<%@ include file="footer.jsp" %>
  </body>
  </html>