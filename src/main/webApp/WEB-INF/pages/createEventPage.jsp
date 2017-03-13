<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<html>
    <head>
      
        <title>This is for creating things!</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    </head>
    <body>
        <h1>Hello <b>
            <c:out value="${pageContext.request.remoteUser}"/></b> </h1>
    

        
<form id="form" action="" method="post">
    EventName: <input type="text" name="eventName"><br>
    Date: <input type="date" name="eventDate"><br>
    Minimum Guests: <input type="text" name="minimumGuests"><br>
    Maximum Guests: <input type="text" name="maximumGuests"><br>
    Location: <input type="text" name="location"><br>
    Food: <input type="text" name="food"><br>
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    <input id="submit" type="button" name="submit" value="submit">
</form>
        

        
        
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
<script>
    $(document).ready(function(){
        // click on button submit
        $("#submit").on('click', function(){
            // send ajax
            $.ajax({
                url: '/createEvent', // url where to submit the request
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