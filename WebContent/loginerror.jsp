<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="j_security_check" method="POST">
		<div class="form-group">
			<label for="">Nombre:</label> 
			<input type="text" value=""
				name="nombre" id="nombre" required="required"
				class="form-control" placeholder="Ingrese Nombre"> <br> 
				<label for="">Password:</label>
			<input type="password" value="" name="password" id="password"
				required="required" class="form-control" placeholder="Ingrese Password"><br>
			<button class="btn btn-primary float-right" type="submit">Login</button>
		</div>
	</form>
</body>
</html>