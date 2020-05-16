<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="static org.sda.java26.utils.AddressesUtil.HELLO_SERVLET_URL" %>
<html>
<head>
    <title>Title</title>
    <%@ include file="header.jsp" %>
</head>
<body>

<div class="container">

    ZWYKŁY FORMULARZ:
    <br>
    <%-- wyrażanie EL --%>
    <%--  ${HELLO_SERVLET_URL} --%>

    <form action="<%= HELLO_SERVLET_URL %>" method="get">
        Podaj imie:
        <br>
        <input type="text" name="user_name">
        <input type="submit" value="Wyślij">
    </form>

    BOOTSTRAP:
    <br>

    <form action="/hello" method="get">
        <div class="form-group">
            <label for="user_name">Podaj imię:</label>
            <input type="text" class="form-control" id="user_name" name="user_name" aria-describedby="emailHelp"
                   placeholder="Imię:">
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
    </form>
</div>

<%@ include file="footer.jsp" %>
</body>
</html>
