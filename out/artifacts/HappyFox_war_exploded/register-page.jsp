<%--
  Created by IntelliJ IDEA.
  User: h
  Date: 8/16/2018
  Time: 10:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
</head>
<body>
<%@include file="index.jsp"%>
<form action="register" method="post">
    First name :<input type="text" name="firstName"><br><br>
    Last name :<input type="text" name="lastName"><br><br>
    Age :<input type="number" name="age"><br><br>
    Email :<input type="text" name="email"><br><br>
    Username:<input type="text" name="username">
    Password:<input type="text" name="password">
    <input type="submit" value="REGISTER"><br>
</form>
</body>
</html>
