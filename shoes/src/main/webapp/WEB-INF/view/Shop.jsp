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
<!--
/* @group Blink */
.blink {
	-webkit-animation: blink .75s linear infinite;
	-moz-animation: blink .75s linear infinite;
	-ms-animation: blink .75s linear infinite;
	-o-animation: blink .75s linear infinite;
	 animation: blink .75s linear infinite;
}
@-webkit-keyframes blink {
	0% { opacity: 1; }
	50% { opacity: 1; }
	50.01% { opacity: 0; }
	100% { opacity: 0; }
}
@-moz-keyframes blink {
	0% { opacity: 1; }
	50% { opacity: 1; }
	50.01% { opacity: 0; }
	100% { opacity: 0; }
}
@-ms-keyframes blink {
	0% { opacity: 1; }
	50% { opacity: 1; }
	50.01% { opacity: 0; }
	100% { opacity: 0; }
}
@-o-keyframes blink {
	0% { opacity: 1; }
	50% { opacity: 1; }
	50.01% { opacity: 0; }
	100% { opacity: 0; }
}
@keyframes blink {
	0% { opacity: 1; }
	50% { opacity: 1; }
	50.01% { opacity: 0; }
	100% { opacity: 0; }
}
/* @end */
-->
  </style>
</head>
<center><h1 style="font-size: 40px; color: black">Shoe Clue's</h1></center><br></br><hr></hr>
<center><h1 style="font-size: 25px; color: black">Select Your Brand</h1></center>
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
      <a href="Adidas?data=Adidas" class="thumbnail">
        <p class="tab blink">Flat 30% off.</p>    
        <img src="<c:url value="/resources/images/adidas.jpg"/>"  style="width:200px; height:150px">
      </a>
    </div>
   <div class="col-md-4">
      <a href="Bata?data=Bata" class="thumbnail">
           <p class="tab blink">Up to 36% off.</p>   
        <img src="<c:url value="/resources/images/Bata.jpg"/>" style="width:200px; height:150px">
      </a>
    </div>
    <div class="col-md-4">
      <a href="Diesel?data=Diesel" class="thumbnail">
          <p class="tab blink">Up To 20% off.</p>  
        <img src="<c:url value="/resources/images/diesel.jpg"/>"  style="width:200px; height:150px">
      </a>
    </div>
    <div class="col-md-4">
      <a href="LeeCooper?data=LeeCooper" class="thumbnail">
           <p class="tab blink">Up to  30% off.</p>     
        <img src="<c:url value="/resources/images/leecooper.jpg"/>"  style="width:200px; height:150px">
      </a>
    </div>
    <div class="col-md-4">
      <a href="Levis?data=Levis" class="thumbnail">
          <p class="tab blink">Flat 9% off.</p>    
        <img src="<c:url value="/resources/images/levis.jpg"/>"   style="width:200px; height:150px">
      </a>
    </div>
    <div class="col-md-4">
       <a href="Nike?data=Nike" class="thumbnail">
           <p class="tab blink">Flat 10% off.</p>     
        <img src="<c:url value="/resources/images/nike.jpg"/>"   style="width:200px; height:150px">
      </a>
    </div>
    <div class="col-md-4">
       <a href="Paraqon?data=Paraqon" class="thumbnail">
           <p class="tab blink">Flat 40% off.</p>  
        <img src="<c:url value="/resources/images/paraqon.jpg"/>"   style="width:200px; height:150px">
      </a>
    </div>
    <div class="col-md-4">
       <a href="Puma?data=Puma" class="thumbnail">
           <p class="tab blink">Flat 20% off.</p>    
        <img src="<c:url value="/resources/images/puma.jpg"/>"   style="width:200px; height:150px"">
      </a>
    </div>
    <div class="col-md-4">
       <a href="RedTape?data=RedTape" class="thumbnail">
           <p class="tab blink">Flat 20% off.</p>    
        <img src="<c:url value="/resources/images/RedTape.jpg"/>"   style="width:200px; height:150px">
      </a>
    </div>
    <div class="col-md-4">
       <a href="Reebok?data=Reebok" class="thumbnail">
           <p class="tab blink">Flat 20% off.</p>    
        <img src="<c:url value="/resources/images/reebok.jpg"/>"  style="width:200px; height:150px">
      </a>
    </div>
     <div class="col-md-4">
       <a href="Sparx?data=Sparx" class="thumbnail">
           <p class="tab blink">Flat 20% off.</p>    
        <img src="<c:url value="/resources/images/sparx.jpg"/>"   style="width:200px; height:150px">
      </a>
    </div>
    <div class="col-md-4">
       <a href="Tommy?data=Tommy" class="thumbnail">
           <p class="tab blink">Flat 20% off.</p>    
        <img src="<c:url value="/resources/images/tommy.jpg"/>"   style="width:200px; height:150px">
      </a>
    </div>
  </div>
</div>
</body>
</html>
