<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Spring Security Example - ProgrammingFree</title>
         <jsp:include page="../includes/css.jsp"></jsp:include>
    </head>
    <body>      
        <div class="container">
            <header>
                <div class="logo"></div>
                <nav>
                    <ul>
                        <li><a href="<spring:url value='/eventPage' />">EventPage</a></li>
                        <li><a href="<spring:url value='/userProfilePage' />">UserProfile Page</a></li>
                        <li><a href="<spring:url value='/createPage' />">Create user and user profile Page</a></li>
                        <li><a href="<spring:url value='/login' />">Log in</a></li>
                     </ul>
                </nav>
            </header>
        </div>
        <jsp:include page="../includes/js.jsp"></jsp:include>
    </body>
</html>