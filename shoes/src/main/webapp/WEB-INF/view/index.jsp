<!DOCTYPE html>
<html lang="en">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Shoe Clue's</title>
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
    <!-- Bootstrap Core CSS -->
    <link href="<c:url value="/resources/css/bootstrap.min.css"/>" rel="stylesheet">
    <script src="<c:url value="/resources/js/bootstrap.min.css"/>"></script>
     <script src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>

    <!-- Custom CSS -->
    <link href="<c:url value="/resources/css/simple-sidebar.css"/>" rel="stylesheet">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
     <style>
     .carousel-indicators{visibility:hidden}
  .carousel-inner > .item > img,
  .carousel-inner > .item > a > img {
      width: 70%;
      margin: auto;
  }
  </style>
</head>
<body>

    <div id="wrapper">

        <!-- Sidebar -->
        <div id="sidebar-wrapper">
            <ul class="sidebar-nav">
                <li class="sidebar-brand">
                   <h2 style="color: white">
                       Shoe Clue's
                    </h2>
                </li>
                <li>
                    <a href="AboutUs">About Us</a>
                </li>
                <li>
                    <a href="index">Home</a>
                </li>
                <li>
                    <a href="Product">All Categories</a>
                </li>
                <li>
                    <a href="SignUp">Sign Up</a>
                </li>
                <li>
                    <a href="Product">Customer Login</a>
                </li>
                 <li>
                    <a href="AdminCheck">Admin Login</a>
                </li>
            </ul>
        </div>
        <!-- /#sidebar-wrapper -->

        <!-- Page Content -->
        <div id="page-content-wrapper">
            <div class="container-fluid">
                <div class="row">
                    
<div class="container">
<div>
<h2><a href="ShopNow" style="color:black">Shop Now</a></h2>
</div>
  <br>
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
        <img src="<c:url value="/resources/images/shoe1.jpg"/>"  style="width:400px; height:300px">
      </div>

      <div class="item">
        <img src="<c:url value="/resources/images/shoe2.jpg"/>"  style="width:400px; height:300px">
      </div>
    
      <div class="item">
        <img src="<c:url value="/resources/images/shoe3.jpg"/>" style="width:400px; height:300px">
      </div>

      <div class="item">
        <img src="<c:url value="/resources/images/shoe4.jpg"/>"  style="width:400px; height:300px">
      </div>
  
    </div>
  </div>
</div>

                </div>
            </div>
        </div>
        <!-- /#page-content-wrapper -->

    </div>
    <!-- /#wrapper -->
    <script>
    $(document).ready(function(){
    	$("#myCarousel").carousel({interval:2000});
    });
    $("#menu-toggle").click(function(e) {
        e.preventDefault();
        $("#wrapper").toggleClass("toggled");
    });
    </script>

</body>

</html>
