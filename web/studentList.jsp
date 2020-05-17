<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>

<%!
    private List<String> student = new ArrayList<>();
%>
<%
    student.add("Jan");
    student.add("Karol");
    student.add("Tomasz");
%>

<c:forEach>

</c:forEach>


<body>

</body>
</html>
