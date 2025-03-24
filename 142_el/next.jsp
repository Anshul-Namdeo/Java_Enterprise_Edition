<%@ page import="java.util.Map" %>

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

    <% Map recs = (Map)request.getAttribute("mno"); %>
    <h1>AAM Zindagi : <%= recs.get("bbb") %></h1>

    <p>--------------------------------</p>

    <h1>Mentos Zindagi: ${mno.bbb}</h1>

    <p>--------------------------------</p>

    <h1>Mentos Zindagi: ${requestScope.mno.bbb}</h1>

</body>
</html>