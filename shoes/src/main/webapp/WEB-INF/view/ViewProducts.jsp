<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  
    pageEncoding="ISO-8859-1"%>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<h1>List of Products</h1>  
  
<c:if test="${!empty products}">  
 <table align="left" border="1">  
  <tr>  
   <th>Product ID</th>  
   <th>Product Name</th>  
   <th>product price</th>  
   <th>Product Description</th>  
  </tr>  
  
  <c:forEach items="${products}" var="product">  
   <tr>  
    <td><c:out value="${product.id}"/></td>  
    <td><c:out value="${product.name}"/></td>  
    <td><c:out value="${product.price}"/></td>  
    <td><c:out value="${product.description}"/></td>   
     <td align="center"><a href="edit.html?id=${product.id}">Edit</a> | <a href="delete.html?id=${product.id}">Delete</a></td>  
   </tr>  
  </c:forEach>  
 </table>  
</c:if>  
</body>  
</html>  