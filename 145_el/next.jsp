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

    <% String[][] arr = (String[][])request.getAttribute("mno"); %>

    <h1><%= arr %></h1>
    <h1><%= arr[0][0] %></h1>
    <h1><%= arr[0][1] %></h1>
    <h1><%= arr[1][2] %></h1>

    <p>---------------------------------------------------</p>

    <h1> ${mno} </h1>

    <h1> ${mno[0]} </h1>

    <h1> ${mno[1]} </h1>

    <h1> ${mno[0][0]} </h1>

    <h1> ${mno[1][2]} </h1>



</body>
</html>