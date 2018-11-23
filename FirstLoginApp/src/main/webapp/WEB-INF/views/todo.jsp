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
            <li><a href="/logout.do">LogOut</a></li>
        </ul>
    </nav>
    <div class="container">
		<h1>Welcome ${name}</h1>
		Your To Do list:
		<ol>
			<c:forEach items="${todos}" var="todo">
				<li>${todo.name} &nbsp; &nbsp; <a href="/delete-todo.do?todo=${todo.name}">Delete</a></li>
			</c:forEach>
		</ol>
		<form action="/add-todo.do" method="post">
		<input type="text" name="todo"><input type="submit" value="Add">
		</form>
	</div>
		<footer class="footer">
    	    <div>Footer content</div>
	    </footer>
		<script> src="webjars/jquery/1.9.1/jquery.min.js"</script>
		<script> src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"</script>
</body>
</html>