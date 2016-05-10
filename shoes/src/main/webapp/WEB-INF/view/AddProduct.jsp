<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration</title>
</head>
<body>
    <div align="center">
        <form:form action="./StoreProduct" method="post">
            <table border="0">
                <tr>
                    <td colspan="2" align="center"><h2>Add Products</h2></td>
                </tr>
                <tr>
                    <td>ProductName:</td>
                    <td><form:input path="name" /></td>
                </tr>
                <tr>
                    <td>price:</td>
                    <td><form:input path="price" /></td>
                </tr>
                <tr>
                    <td>description</td>
                    <td><form:input path="description" /></td>
                </tr>
                <tr>
                    <td colspan="2" align="center"><input type="submit" value="AddProduct" /></td>
                </tr>
            </table>
        </form:form>
    </div>
</body>
</html>