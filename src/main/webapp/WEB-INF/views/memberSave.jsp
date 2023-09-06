<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-09-05
  Time: 오전 11:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>memberSave.sjp</title>
  <link rel="stylesheet" href="/resources/css/bootstrap.min.css">
</head>
<body>
<div id="section">
    <form action="/save" method="post">
        <input class="for" type="text" name="memberEmail" placeholder="이메일"> <br>
        <input type="text" name="memberPassword" placeholder="비밀번호"> <br>
        <input type="text" name="memberName" placeholder="이름"> <br>
        <input type="text" name="memberBirth" placeholder="생년월일"> <br>
        <input type="text" name="memberMobile" placeholder="전화번호"> <br>
        <input type="submit" value="전송">
    </form>
</div>
</body>
</html>
