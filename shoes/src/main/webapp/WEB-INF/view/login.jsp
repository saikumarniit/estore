<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
   <link rel="stylesheet" type="text/css" href="./resources/css/style.css" media="all" />
    <link rel="stylesheet" type="text/css" href="./resouces/css/demo.css" media="all" />
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
    <li><a href="index" style="color: white">Home</a></li>
  </div>
    <div align="center" class="form">
   <form name='f' action="<c:url value='j_spring_security_check'/>" method='POST' >
      <table>
         <tr>
            <td><input type='text' name='j_username' style="width: 200px" placeholder="UserName Required" required="true"></td>
         </tr>
         <tr>
            <td><input type='password' name='j_password' style="width: 200px" placeholder="Password Required" required="true"/></td>
         </tr>
         <tr>
            <td><input name="submit" type="submit" value="submit" /></td>
         </tr>
      </table>
  </form>
 </div>
    <div>
    <h4 >Copy Rights @ NIIT LTD</h4>
    </div>
</body>
</html>