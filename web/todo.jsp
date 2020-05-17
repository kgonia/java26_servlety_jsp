<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@ include file="menu.jsp" %>

<form action="/todo.jsp">
    Napisz co chcesz zrobić:
    <input type="text" name="item">
    <br>
    <input type="submit" value="Wyślij">
</form>

Item ma wartość:
<%
    String item = request.getParameter("item");
    out.println(item);
    out.println("<br>");

    List<String> todoList = (List<String>) session.getAttribute("itemsList");

    // jesli lista nie istnieje to ją stwórz i dodaj do sesji
    // odpali sie przy pierwszym wejsciu na stronę
    if (todoList == null) {
        todoList = new ArrayList<>();
        session.setAttribute("itemsList", todoList);
    }

    if (item != null) {
        todoList.add(item);
    }

    out.println("Wszystkie elementy: ");
    out.println("<br>");
    for (String todoItem : todoList) {
        out.println(todoItem);
        out.println("<br>");
    }
%>

</body>
</html>
