<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@ include file="menu.jsp"%>

<%
    Cookie[] cookies = request.getCookies();

    for(Cookie cookie: cookies){
        out.println(cookie.getName());
        out.println(": ");
        out.println(cookie.getValue());
        out.println("<br>");
    }
%>

</body>
</html>
