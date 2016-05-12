<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  
    pageEncoding="ISO-8859-1"%>  
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>     
<!DOCTYPE html>
<html lang="en">
<head>
  <title>ViewDetails</title>
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
          
        <form:form action="./StoreProduct" method="post" style="background-color:black" enctype="multipart/form-data">
            <table border="0">
                <tr>
                    <td colspan="2" align="center"><h3>Edit Product </h3></td>
                </tr>
                <tr>
                    <td style="color:white">Product Id:</td>
                    <td><form:input path="id" value="${product.id}" readonly="true" style="width:250px"/></td>
                </tr>
                <tr>
                    <td style="color:white">ProductName:</td>
                    <td><form:input path="name" value="${product.name}" style="width:250px"/></td>
                </tr>
                <tr>
                     <td style="color:white">price:</td>
                    <td><form:input path="price" value="${product.price}" style="width:250px"/></td>
                </tr>
                <tr>
                     <td style="color:white">manufacturer</td>
                    <td><form:input path="description" value="${product.description}" style="width:250px"/></td>
                </tr>
                  <tr> 
                  Choose File: <input type="file" name="file">
                </tr>
                <tr>
                    <td colspan="2" align="center"><input type="submit" value="Save" /></td>
                </tr>
            </table>
        </form:form>
</body>  
 <div>
    <h4 >Copy Rights @ NIIT LTD</h4>
    </div>
</html>