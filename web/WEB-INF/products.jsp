<%@ taglib tagdir="/web/WEB-INF/tags" prefix="t" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<%@ taglib uri="http://www.springframework.org/tags"  prefix="locale"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<t:template>
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
</t:template>