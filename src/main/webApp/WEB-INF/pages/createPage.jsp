<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <title>This is for creating things!</title>
    </head>
    <body>
        <h1>Hello <b>
            <c:out value="${pageContext.request.remoteUser}"/></b> </h1>
    
        <div>
              <form action="#" th:action="/createUser" th:object="${user}" method="post">
            <table>
                <tr>
                    <td>Name:</td>
                    <td><input type="text" th:field="*{username}" /></td>
                </tr>
                <tr>
                    <td>Password:</td>
                    <td><input type="text" th:field="*{password}" /></td>
                </tr>
                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                <tr>
                    <td><button type="submit">Submit</button></td>
                </tr>
            </table>
        </form>
        
        
        </div>
        <div>
        
              <form action="#" th:action="@{/createUserProfilePage}" th:object="${UserInformation}" method="post">
            <table>
                <tr>
                    <td>Name:</td>
                    <td><input type="text" th:field="*{name}" /></td>
                </tr>
                <tr>
                    <td>Age:</td>
                    <td><input type="text" th:field="*{age}" /></td>
                </tr>
                <tr>
                    <td><button type="submit">Submit</button></td>
                </tr>
            </table>
        </form>
        
        
        
        
        </div>
        
        <form action="/logout" method="post">
            <input type="submit" value="Sign Out"/>
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        </form>
    </body>
</html>