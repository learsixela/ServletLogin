<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	 <form action="Login" method="POST">
    	<h3>Login</h3>
    	<p>Nombre: </p><input type= "text" value="" name="nombre" id="nombre" required="required"> <br>
    	<p>Password: </p><input type= "password" value="" name="password" id="password"required="required"><br>
        <button type="submit">Login</button>
    </form>
</body>
</html>