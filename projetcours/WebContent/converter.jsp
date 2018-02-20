<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="theme/css/bootstrap.css">
<script src="theme/js/bootstrap.js"></script>
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-lg">
				<nav class="navbar navbar-expand-sm bg-dark navbar-dark fixed-top">
				<ul class="navbar-nav">
					<li class="nav-item"><a class="nav-link" href="Index">Menu</a></li>
					<li class="nav-item active"><a class="nav-link" href="Eleve">Eleve</a></li>
					<li class="nav-item"><a class="nav-link" href="Contact">Contact</a>
					<li class="nav-item"><a class="nav-link" href="Login">Login</a></li>
					</li>

				</ul>
				</nav>
			</div>
		</div>
		<div class="row">
			<div class="col-lg">
				<br> <br> <br>
				<h2>Converter</h2>
				<hr />
			</div>
		</div>
		<%
					if (request.getAttribute("message") != null){
						
				%>
		<div class="row">
			<div class="alert alert-danger">
				
				
				<strong>Erreur!</strong>
				
				<%out.write(request.getAttribute("message").toString()); %>
				
			</div>
		</div>
		<%} %>
		
		<div class="row">
			<div class="col-sm-4">Celcius value</div>
			<div class="col-sm-8">
				<form class="navbar-form pull-left" method="POST">
					<input type="text" class="span2" name="celcius">
					<button type="submit" class="btn">Convert</button>
				</form>
			</div>
		</div>

		<br> <br>


		<div class="row">
			<div class="col-sm-4">Fahrenheit</div>
			<div class="col-sm-8">
				<%
					if (request.getAttribute("result") != null)
						out.write(request.getAttribute("result").toString());
				%>
			</div>
		</div>


	</div>
</body>
</html>