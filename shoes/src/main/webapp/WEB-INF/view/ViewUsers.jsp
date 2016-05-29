<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
 <% 
 response.setHeader("pragma", "no-cache");
 response.setHeader("Cache-control", "no-cache, no-store, must-revalidate");
 response.setHeader("Expires", "0");
 %>
<head>
 
<title>ViewProducts</title>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
  <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
  <script>document.write('<base href="' + document.location + '" />');</script>
    <link href="./resources/css/bootstrap.min.css" rel="stylesheet" media="screen">
    <link href="./resources/css/style.css" rel="stylesheet" media="screen">
    <script data-require="angular.js@1.0.x" src="http://code.angularjs.org/1.0.7/angular.min.js" data-semver="1.0.7"></script>
</head>

<body>    
<div class="container">
  <center><h2 style="color: black;">Shoe Clue's</h2></center>
  <div>
  <ul class="nav nav-pills" style="background-color: black;">
    <li><a href="AdminCheck" style="color: white">Home</a></li>
     </div>
  <div>
  <hr>
  </div>
  
  <div ng-app="myApp" ng-controller="namesCtrl">
<input type="text"  ng-model="search">&nbsp&nbsp<span class="glyphicon glyphicon-search"></span>
    
    <table class="table table-striped">
    <tr>
    
    <th>User Name</th>
    <th>Email Id</th>
    </tr>
        <tr ng-repeat="resource in names | filter:search">
            <td>{{ resource.username }}</td>
            <td>{{ resource.email}}</td>
            <td> <a href="AddtoCart?id={{resource.username}}">
 <a href="deleteCustomer.html?id={{resource.username}}">Delete</a></td>
</a></td>
        </tr>    
    </table>

<script>
angular.module('myApp', []).controller('namesCtrl', function($scope) {
    $scope.names = ${users};
    	
    	$scope.orderByMe = function(x) {
        $scope.myOrderBy = x;
    }
});
</script></body>
 <div>
    <h4 >Copy Rights @ NIIT LTD</h4>
    </div>
</html>