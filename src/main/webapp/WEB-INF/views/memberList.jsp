<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-09-05
  Time: 오후 2:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>memberList.jsp</title>
</head>
<body>
<table>
    <tr>
        <td>id</td>
        <td>이메일</td>
        <td>비밀번호</td>
        <td>이름</td>
        <td>생년월일</td>
        <td>전화번호</td>
    </tr>
    <c:forEach items="${memberlist}" var="member">
    <tr>
        <td>${member.memberEmail}</td>
        <td>${member.memberPassword}</td>
        <td>${member.memberName}</td>
        <td>${member.memberBirth}</td>
        <td>${member.memberMobile}</td>
    </tr>
    </c:forEach>
    </table>
</body>
</html>