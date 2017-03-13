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
        
        
               
<form id="form" action="" method="post">
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    <input id="submit" type="button" name="Get Events" value="submit">
</form>
        

        
        
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
<script>
    $(document).ready(function(){
        // click on button submit
        $("#submit").on('click', function(){
            // send ajax
            $.ajax({
                url: '/getEventsForUser', // url where to submit the request
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
        
        
        
        
        <form action="/logout" method="post">
            <input type="submit" value="Sign Out"/>
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        </form>
    </body>
</html>