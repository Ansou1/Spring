<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!Doctype html>
<html>
<head>
    <title>Customer Registration Form</title>

    <style>
        .error {color: red}
    </style>
</head>

<body>

    <form:form action="processForm" modelAttribute="customer">
        FirstName: <form:input path="firstName" />
        <br>
        <br>
        LastName: <form:input path="lastName" />
        <form:errors path="lastName" cssClass="error" />
        <br>
        <br>
        <input type="submit" value="Submit"/>
    </form:form>

</body>

</html>