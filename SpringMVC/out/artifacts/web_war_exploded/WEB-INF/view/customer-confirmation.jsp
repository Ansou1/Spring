<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!Doctype html>
<html>
<head>
    <title>Customer Confirmation Page</title>
</head>

<body>
    The customer data: <br>
    FirstName: ${customer.firstName} <br>
    LastName: ${customer.lastName} <br>
    Passes: ${customer.freePasses} <br>
    Postal Code: ${customer.postalCode} <br>
    Course Code: ${customer.courseCode} <br>
</body>

</html>