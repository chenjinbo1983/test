<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
hello.jsp
<table align='left' border='1' cellspacing='0'>
    <tr>
        <td>id</td>
        <td>userName</td>
    </tr>
    <c:forEach items="${users}" var="s" varStatus="st">
        <tr>
            <td>${s.id}</td>
            <td>${s.userName}</td>
        </tr>
    </c:forEach>
</table>