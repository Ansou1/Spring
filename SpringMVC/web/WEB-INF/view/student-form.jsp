<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!Doctype html>
<html>
<head>
    <title>Student registration form</title>
</head>

<body>

    <form:form action="processForm" modelAttribute="student">

        Firstname: <form:input path="firstName"/>
        <br><br>
        Lastname: <form:input path="lastName"/>
        <br><br>
        <form:select path="country">
            <form:options items="${student.countryOptions}" />
        </form:select>
        <br><br>
        Favorite language:
        <br>
        <form:radiobutton path="favoriteLanguage" value="C" label="C"/>
        <form:radiobutton path="favoriteLanguage" value="C++" label="C++"/>
        <form:radiobutton path="favoriteLanguage" value="Java" label="Java"/>
        <form:radiobutton path="favoriteLanguage" value="Python" label="Python"/>
        <form:radiobutton path="favoriteLanguage" value="Javascript" label="Javascript"/>
        <br><br>
        <form:checkbox path="operatingSystems" value="IOS" label="IOS" />
        <form:checkbox path="operatingSystems" value="Linux" label="Linux" />
        <form:checkbox path="operatingSystems" value="Windows" label="Windows" />
        <br><br>
        <input type="submit" value="Submit">

    </form:form>

</body>

</html>