<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/resources/css/main.css">
</head>
<body>
    <h1>index.jsp</h1>

    <a href="save">회원가입</a>
    <a href="login">로그인페이지</a>
    <a href="members">목록출력</a>
    <br>
    로그인이메일: ${sessionScope.loginEmail}
    model에 담은 이메일: ${email}<br>
</body>
</html>













