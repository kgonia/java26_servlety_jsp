<%@ page import="java.util.Date" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>

<%!
    private String upper(String input){
        return input.toUpperCase();
    }

    private int counter = 0;
%>

<body>
Jakiś tekst
<br>

<%= upper("Inny tekst") %>
<br>

<%= new Date()%>
<br>

<%= "Jesteś " + ++counter + " gościem na stronie" %>

</body>
</html>
