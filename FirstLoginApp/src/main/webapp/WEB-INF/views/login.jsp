<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	<title>Hello</title>
    <link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
    <style>
        .footer{
            position: absolute;
            bottom: 0;
            width: 100%;
            height: 60px;
            background-color: #f5f5f5;
        }
    </style>    
</head>
<body>
    <nav class="nav navbar-default">
        <a href="/" class="navbar-brand">Brand</a>
        <ul class="nav navbar-nav">
            <li class="active"><a href="#">Home</a></li>
            <li><a href="/list-todo.do">Todos</a></li>
            <li><a href="http://www.udemy.com">Udemy</a></li>
        </ul>
        <ul class="nav navbar-nav navbar-right">
            <li><a href="/login.do">Login</a></li>
        </ul>
    </nav>
    <div class="container">
    
	<h1>Hello ${name}</h1>
	<p style="color:red;">${errorMessage}</p>
	<form action="/login.do" method="post">
	Enter your username: <input type="text" name="name"/><br>
	Enter your password: <input type="password" name="pw"/><br>
	<input type="submit" value="Login"/>
	</form>
    
    </div>
		<footer class="footer">
    	    <div>Footer content</div>
	    </footer>
		<script> src="webjars/jquery/1.9.1/jquery.min.js"</script>
		<script> src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"</script>
</body>
</html>