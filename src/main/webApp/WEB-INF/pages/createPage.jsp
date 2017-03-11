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
    
        <div>
            <h1>Form:</h1>
            <form action="/createUser"  method="post">
            <p>Name:        <input type="text" name="username" /></p>   
            <p>Password:    <input type="text" name="password" /></p>
                            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                            <input type="submit" value="Submit">
            </form>
          
<form id="myForm" action="/createUser">
  First name: <input type="text" name="username"><br>
  Last name: <input type="text" name="password"><br><br>
  <input type="button" onclick="mySubmitFunction()" value="Submit form">
</form>
            
        </div>
        
        <form id="form" action="" method="post">
Name: <input type="text" name="username"><br>
Age: <input type="text" name="password"><br>
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
                url: '/createUser', // url where to submit the request
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