<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
hello.jsp
${now}
<table align='left' border='1' cellspacing='0'>
    <tr>
        <td>id</td>
        <td>msg</td>
    </tr>
    <c:forEach items="${tests}" var="s" varStatus="st">
        <tr>
            <td>${s.id}</td>
            <td>${s.msg}</td>
        </tr>
    </c:forEach>
</table>
<table align='center' border='1' cellspacing='0'>
    <tr>
        <td>id</td>
        <td>appid</td>
        <td>phone</td>
        <td>type</td>
        <td>starttime</td>
        <td>endtime</td>
        <td>region</td>
        <td>status</td>
        <td>point</td>
    </tr>
    <c:forEach items="${logs}" var="s" varStatus="st">
        <tr>
            <td>${s.id}</td>
            <td>${s.appid}</td>
            <td>${s.phone}</td>
            <td>${s.type}</td>
            <td>${s.starttime}</td>
            <td>${s.endtime}</td>
            <td>${s.region}</td>
            <td>${s.status}</td>
            <td>${s.point}</td>
        </tr>
    </c:forEach>
</table>