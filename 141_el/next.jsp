<%@ page import="models.User" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Next page</h1>
    <hr>

    <% User user = (User)request.getAttribute("mno"); %>

    <%--<h1>AAM Zindagi : <%=user.getName() %> </h1>--%>

    <p>--------------------------------</p>

    <h1>Mentos Zindagi: ${mno.name}</h1>

    <p>--------------------------------</p>

    <h1>Mentos Zindagi: ${requestScope.mno.name}</h1>

</body>
</html>