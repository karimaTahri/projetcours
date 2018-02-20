<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="theme/css/bootstrap.css">
<script src="theme/js/bootstrap.js"></script>
<title>Login</title>
</head>
<body>


<div class="container">
<div class="row">
<div class="col-xs-12">
	
	<div class="contain">
			<div class="row">
			<div class="col-lg">
				<nav class="navbar navbar-expand-sm bg-dark navbar-dark fixed-top">
					<ul class="navbar-nav">
						<li class="nav-item"><a class="nav-link" href="Index">Menu</a></li>
						<li class="nav-item"><a class="nav-link" href="Eleve">Eleve</a></li>
						<li class="nav-item"><a class="nav-link" href="Contact">Contact</a>
						<li class="nav-item active"><a class="nav-link" href="Login">Login</a></li>
						</li>

					</ul>
				</nav>
			</div>
		</div>
		<div class="row">
		<div class="col">
					
			<h1>Login</h1>
			<h2>Saisir votre login mot de passe</h2>
					
			<form action="/projetWeb1/Login" name="login" role="form" class="form-horizontal" method="post" accept-charset="utf-8">

				<div class="form-group">
				<div class="col-md-8"><input name="username" placeholder="Idenfiant" class="form-control" type="text" id="UserUsername"/></div>
				</div> 
				
				<div class="form-group">
				<div class="col-md-8"><input name="password" placeholder="Mot de passe" class="form-control" type="password" id="UserPassword"/></div>
				</div> 
				
				<div class="form-group">
				<div class="col-md-offset-0 col-md-8"><input  class="btn btn-success btn btn-success" type="submit" value="Connexion"/></div>
				</div>
			
			</form>

		

		</div>
		</div>
		
	</div>

</div>
</div>
</div>

</body>
</html>