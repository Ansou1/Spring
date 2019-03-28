<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!Doctype html>

<html>

<head>
    <title>Student Confirmation</title>
</head>

<body>

    The student is confirmed: ${student.firstName} ${student.lastName} from ${student.country}
    Best language is ${student.favoriteLanguage}

    Operating System:
    <ul>
        <c:forEach var="temp" items="${student.operatingSystems}">
            <li>${temp}</li>
        </c:forEach>
    </ul>

</body>

</html>