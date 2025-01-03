<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>:: ISRDC :: Signup Page</title>

    <link rel="stylesheet" href="static/css/header.css">
    <link rel="stylesheet" href="static/css/footer.css">
    <link rel="stylesheet" href="static/css/common.css">
    <link rel="stylesheet" href="static/css/form.css">

    <style>


    </style>
</head>
<body>
    
    <div id="main_container">

        <%@ include file="header.jsp" %>
        <!-- <div id="header">
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
        </div> -->

        <div id="main_body">
            <form action="signup.do" method="post" id="form_box">
                    <h2>SignUp</h2>
                    <div>
                        <label for="user_name">Full Name:</label>
                        <input type="text" name="full_name" id="user_name">
                    </div>
                    <div>
                        <label for="email">Email:</label>
                        <input type="email" name="email" id="email">
                    </div>
                    <div>
                        <label for="password">Password :</label>
                        <input type="password" name="password" id="password">
                    </div>
                 <div style="text-align: center;">
                    <input type="submit" value="SignUp">
                 </div>
            </form>
        </div>

        <%@ include file="footer.jsp" %>
        <!-- <div id="footer">
            <span>&copy: ISRDC jabalpur, since 800AD</span>
        </div> -->
    </div>
</body>
</html>