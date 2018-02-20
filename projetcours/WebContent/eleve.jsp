<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
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
			<br>
			<br>
			<br>
				<h2>Eleve</h2>
				<hr />
			</div>
		</div>
		<form action="/projetWeb1/Eleve" method="post">
			<div class="row">
				<div class="col-sm-4">Nom</div>
				<div class="col-sm-8">
					<input type="text" name="tnom" size="20">
				</div>
			</div>
			<div class="row">
				<div class="col-sm-4">Prénom</div>
				<div class="col-sm-8">
					<input type="text" name="tprenom" size="20">
				</div>
			</div>
			<div class="row">
				<div class="col-sm-4">Adresse</div>
				<div class="col-sm-8">
					<input type="text" name="tadresse" size="20">
				</div>
			</div>
			<div class="row">
				<div class="col-sm-4">Né(e) le</div>
				<div class="col-sm-8">
					<input type="text" name="tnele" size="20">
				</div>
			</div>
			<div class="row">
				<div class="col-lg">
					<input type="submit" value="Valider" class="btn btn-info">
				</div>
			</div>
		</form>
	</div>
</body>
</html>