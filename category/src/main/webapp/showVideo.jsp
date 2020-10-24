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
        <td>title</td>
        <td>intro</td>
        <td>video</td>
        <td>createAt</td>
    </tr>
    <c:forEach items="${videos}" var="c">
        <tr>
            <td>${c.id}</td>
            <td>${c.title}</td>
            <td>${c.intro}</td>
            <td><a href="http://localhost:8766/category/queryByVideo?cateId=${c.id}">
                <video href="${c.videoUrl}" poster="${pageContext.request.contextPath}${c.coverUrl}" width="40px"
                       height="40px"/>
            </a></td>
            <td>${c.createAt}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
