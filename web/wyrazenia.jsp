<%@ page import="java.util.Date" %>
<%@ page import="org.sda.java26.utils.JspUtil" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>

<%!
    private int counter = 0;
%>

<body>
Jakiś tekst
<br>

<%= JspUtil.upper("Inny tekst") %>
<br>

<%= new Date()%>
<br>

<%= "Jesteś " + ++counter + " gościem na stronie" %>

<%
    String var = "Coś";
    var = JspUtil.upper(var);
    out.println(var);
%>

</body>
</html>
