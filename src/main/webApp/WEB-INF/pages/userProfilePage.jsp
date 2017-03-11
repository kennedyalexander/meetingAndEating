<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>


</head>
<body>


	<div class="container">
        <br>
        ${username}
        <br>
        ${firstName}
        <br>
        ${lastName}
        <br>
        ${dateOfBirth}
        <br>
        ${emailAddress}
        <br>
        ${location}
        <br>
    </div>

    <form action="/logout" method="post">
            <input type="submit" value="Sign Out"/>
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        </form>
    
</body>

</html>