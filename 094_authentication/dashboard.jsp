
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>:: ISRDC :: Dashboard</title>

    <style>
        #main_body{
            text-align: center;;
            padding-top:50px;
        }

        .thumbnail{
            border: 1px solid #ccc;
            padding: 20px;
            margin-bottom: 10px;
            border-radius: 7px;
            display: inline-block;
            width:220px;
            margin-right: 70px;
            background-color: rgb(240, 191, 117);
            cursor: pointer;
        }
        #message {
            margin-bottom: 50px;
            border: 2px solid black;
            border-radius: 10px;
            font-size: 30px;
            margin-left:300px ;
            margin-right:300px ;
            text-align: center;
            padding:10px;
            background-color: rgb(176, 223, 223);
        }

        a {
            text-decoration: none;
        }
    </style>
</head>
<body>
    <div id="main_container">

        <%@ include file="header.jsp" %>
        <!-- <div id="header"></div>
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
            <div id="message">Your Dashboard Page</div>

           <a href="products.do">
            <div id="products" class="thumbnail">
                <img src="static/media/images/products.jpeg" alt="" height="200px">
                <h3>Products</h3>
            </div>
           </a>

           <a href="orders.do">
            <div id="order" class="thumbnail">
                <img src="static/media/images/order.png" alt="" height="200px">
                <h3>Orders</h3>
            </div>
           </a>
        </div>

        <%@ include file="footer.jsp" %>
        <!-- <div id="footer">
            <span>&copy: ISRDC jabalpur, since 800AD</span>
        </div> -->
    </div>
</body>
</html>