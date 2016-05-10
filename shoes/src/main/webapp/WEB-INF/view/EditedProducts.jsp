<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  
    pageEncoding="ISO-8859-1"%>  
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<html>  
 <head>  
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">  
  <title>Spring MVC Form Handling</title>  
 </head>  
 <body>  
        <form:form action="./StoreProduct" method="post">
            <table border="0">
                <tr>
                    <td colspan="2" align="center"><h2>Add Products </h2></td>
                </tr>
                <tr>
                    <td>Product Id:</td>
                    <td><form:input path="id" value="${product.id}" readonly="true"/></td>
                </tr>
                <tr>
                    <td>ProductName:</td>
                    <td><form:input path="name" value="${product.name}"/></td>
                </tr>
                <tr>
                    <td>price:</td>
                    <td><form:input path="price" value="${product.price}"/></td>
                </tr>
                <tr>
                    <td>description</td>
                    <td><form:input path="description" value="${product.description}"/></td>
                </tr>
                <tr>
                    <td colspan="2" align="center"><input type="submit" value="Save" /></td>
                </tr>
            </table>
        </form:form>
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