<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Index page</h1>
    <hr>

    <h1>Header : ${header} </h1>
    <h1>Host : ${header['host']} </h1>
   <h1>Accept : ${header['accept']} </h1>
   <h1>accept-language : ${header['accept-language']} </h1>
   <h1>accept-Charset : ${header['accept-charset']} </h1>
   <h1>accept-Encoding : ${header['accept-encoding']} </h1>
   <h1>user-agent : ${header['user-agent']} </h1>
   <h1>cookie : ${header['cookie']} </h1>
   <h1>connection : ${header['connection']} </h1>
   <h1>cache-control : ${header['cache-control']} </h1>
   <h1>sec-ch-ua-platform : ${header['sec-ch-ua-platform']} </h1>
</body>
</html>