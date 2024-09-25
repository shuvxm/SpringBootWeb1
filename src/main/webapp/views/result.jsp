<%@page language="java" %>

<html>
    <head>
        <!-- Link to external CSS file -->
        <link rel="stylesheet" type="text/css" href="style.css">
    </head>
    <body>
        <%-- <h2>Result is : <%= session.getAttribute("result") %></h2>  --%>

        <%-- JSTL code can be written in ${} --%>
        <h2> Result is: ${result} </h2>
    </body>
</html>
