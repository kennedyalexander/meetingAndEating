<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <title>This is for an event?</title>
    </head>
    <body>
        <h1>This is for an event?  <b><c:out value="${pageContext.request.remoteUser}"/></b> </h1>
        <table>
        <c:if test="${not empty events}">
            <ul>
                <c:forEach var="listValue" items="${events}">
                <tr>
                    <td>
                        ${listValue.getEventName()}
                    </td>
                    <td>
                        ${listValue.getId()}
                    </td>
                    <td>
                        ${listValue.getEventStatus()}
                    </td>
                    <td>       
                        <form id="form" action="/activateEvent" method="post">
                            <input type="hidden" name="eventID" value="${listValue.getId()}"/>
                            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                            <input id="submit" type="button" name="submit" value="submit">
                        </form>
                    </td>
                    </tr>
                </c:forEach>

            </ul>
        </c:if>
        
        </table>
        
        <form action="/logout" method="post">
            <input type="submit" value="Sign Out"/>
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        </form>
        
        
        
        
        
                <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
<script>
    $(document).ready(function(){
        // click on button submit
        $("#submit").on('click', function(){
            // send ajax
            $.ajax({
                url: '/activateEvent', // url where to submit the request
                type : "POST", // type of action POST || GET
                dataType : 'json', // data type
                data : $("#form").serialize(), // post data || get data
                success : function(result) {
                    // you can see the result from the console
                    // tab of the developer tools
                    console.log(result);
                },
                error: function(xhr, resp, text) {
                    console.log(xhr, resp, text);
                }
            })
        });
    });

</script>
    </body>
</html>