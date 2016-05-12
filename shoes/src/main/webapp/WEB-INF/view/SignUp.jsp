<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
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
        <form:form action="./store" method="post" id="contactform" style="background-color:black">
            <table border="0">
                <tr>
                    <td colspan="2" align="center"><h2 style="color: white">Sign Up Here</h2></td>
                </tr>
                <tr>
                </tr>
                <tr>
                  
                    <td><form:input path="username"  placeholder="User Name" required="true" style="width:300px"/></td>
                </tr>
                <tr>
                    
                    <td><form:password path="password"  placeholder="Password" required="true" style="width:300px"/></td>
                </tr>
                
                <tr>
                   
                    <td><form:input path="email"  placeholder="Email" required="true" style="width:300px"/></td>
                </tr>
                <tr>
                    
                    <td><form:input path="hobbies" placeholder="Hobbies"  required="true" style="width:300px"/></td>
                </tr>
                <tr>
                    <td colspan="2" class="buttom" id="submit" align="center"><input id="submit" type="submit" value="Register" style="color:white" /></td>
                </tr>
            </table>
        </form:form>
    </div>
    <div>
    <h4 >Copy Rights @ NIIT LTD</h4>
    </div>
</body>
</html>