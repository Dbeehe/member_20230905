<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-09-06
  Time: 오전 9:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" >
</head>
<body>
    <h2>memberMain.jsp</h2>
    로그인이메일: ${sessionScope.loginEmail}
    model에 담은 이메일: ${email}<br>
    <a href="logout">회원가입</a>
    <a href="/">회원가입</a>
</body>
</html>
