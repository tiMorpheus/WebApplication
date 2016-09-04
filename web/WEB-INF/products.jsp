<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
    <table>
        <th>
            <tr>
                <th>Id</th>
                <th>Title</th>
                <th>Description</th>
                <th>Count</th>
                <th>price</th>
                <th>Category id</th>
                <th>Category title</th>

            </tr>
        </th>
        <tb>
            <c:forEach items="${products}" var="product">
                <tr>
                    <td>${product.id}</td>
                    <td>${product.title}</td>
                    <td>${product.description}</td>
                    <td>${product.count}</td>
                    <td>${product.price}</td>
                    <td>${product.productCategoty.id}</td>
                    <td>${product.productCategoty.title}</td>
                </tr>
            </c:forEach>

        </tb>
    </table>
</body>
</html>