<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: simondaguenet
  Date: 2019-04-18
  Time: 05:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Custom Login Page</title>
    <style>
        .failed { color: red }
    </style>
</head>
<body>
    <h3>My Custom Login Page</h3>
    <form:form action="${pageContext.request.contextPath}/authenticateTheUser" method="post">
        
        <c:if test="${param.error != null}">
            <i class="failed">Sorry! You enter an invalid email or/and password</i>
        </c:if>
        
        <p>
            User name: <input type="text" name="username"/>
        </p>
        <p>
            Password: <input type="password" name="password"/>
        </p>
        <input type="submit" value="Login"/>
    </form:form>
</body>
</html>