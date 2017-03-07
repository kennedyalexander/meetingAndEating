<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Spring Security Example - ProgrammingFree</title>
    </head>
    <body>
        <h1>Welcome!</h1>
        <br>
        <a href="<spring:url value='/eventPage' />">EventPage</a>
        <br>
        <a href="<spring:url value='/userProfilePage' />">UserProfile Page</a>
        <br>
        <a href="<spring:url value='/createPage' />">Create user and user profile Page</a>
        <br>
    </body>
</html>