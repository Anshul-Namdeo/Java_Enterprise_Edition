<%@ page import="models.User" %>

<link rel="stylesheet" href="static/css/header.css">
<link rel="stylesheet" href="static/css/common.css">

<% User user = (User)session.getAttribute("user"); %>

<div id="header">
<img src="static/media/images/logo.jpg" id="logo">
<span id="compnm">Authentication Welcome Page</span>
<ul id="action">
    <% if(user == null) { %>
    <li>
        <a href="signin.do">SignIn</a>
    </li>
    <li>
        <a href="signup.do">SignUp</a>
    </li>
    <% } else { %>  
    <li>
        <span><%= user.getFullName() %></span><a href="signout.do">SignOut</a>
    </li>
    <% }  %>
</ul>
</div>