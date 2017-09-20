<%-- 
    Document   : index
    Created on : Sep 18, 2017, 7:20:27 PM
    Author     : 642202
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Age Next Birthday</h1>
        <form action='AgeCalculate' method='POST'>
            Enter your current age: <input type='number' name='age'>
            <input type='submit' value='Age next birthday'>
        </form>
        <c:if test="${age != null}">
            <span>${age}</span>
        </c:if>
    </body>
</html>
