<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@ include file="menu.jsp"%>
<h2>Wybierz ulubiony język programowanie:</h2>
<br>
<form action="/favorite">
    <select name="language">
        <option>JAVA</option>
        <option>C++</option>
        <option>C#</option>
        <option>Go</option>
        <option>Python</option>
    </select>
    <input type="Submit" value="Wyślij">
</form>

</body>
</html>
