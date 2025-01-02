<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>SuccessFull Response</title>

    <link rel="stylesheet" href="static/css/common.css">
    <link rel="stylesheet" href="static/css/header.css">
    <link rel="stylesheet" href="static/css/footer.css">
   
    <style>

        #main_container {
            border: 4px solid red;
        }

        #message {

            padding: 100px 0px;
            background-color: rgb(168, 218, 168);
            width: 50%;
            border: 1px solid green;
            margin: 50px auto;
            text-align: center;
            border-radius: 10px;
            font-size: 24px;
            color:rgb(28, 69, 135)
        }

    </style>
</head>
<body>
    <div id="main_container">

        <div id="header">
            <img src="static/media/images/logo.jpg" id="logo">
            <span id="compnm">Authentication Welcome Page</span>
            <ul id="action">
                <li>
                    <a href="signin.do">SignIn</a>
                </li>
                <li>
                    <a href="signup.do">SignUp</a>
                </li>
            </ul>
        </div>

       <div id="main_body">
            <div id="message">
                Congratulations! Your Account is create Successfully....
            </div>
       </div>

        <div id="footer">
            <span>&copy: ISRDC jabalpur, since 800AD</span>
        </div>

    </div>
</body>
</html>