<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page pageEncoding="UTF-8" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1px" cellspacing="1px">
    <tr>
        <td>id</td>
        <td>name</td>
        <td>level</td>
    </tr>
    <c:forEach items="${categorys}" var="c">
        <tr>
            <td>${c.id}</td>
            <td><a href="http://localhost:8766/category/queryByVideo?cateId=${c.id}">${c.name}</a></td>
            <td>${c.level}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
