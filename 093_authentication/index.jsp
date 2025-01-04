<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>


    <Style>

        #main_body {
           /* border : 3px solid blue;*/
        }

        #empty_box {
            background-color: #c2d8e0d4;
            width:75%;
            height:200px;
            border-radius: 12px;
            margin:30px auto;
            text-align: center;
           /* padding-top: 50px; */
           display: grid;
           place-items: center;
           color:rgb(118, 57, 224);
           font-size: 24px;
        }
    </Style>
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
            <div id="empty_box">
                No content Planned So Far...
            </div>
        </div>

        <%@ include file="footer.jsp" %>
        <!-- <div id="footer">
            <span>&copy: ISRDC jabalpur, since 800AD</span>
        </div> -->

    </div>
</body>
</html>