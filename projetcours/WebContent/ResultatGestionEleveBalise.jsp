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

<jsp:useBean id="Eleve" scope="request" class="fr.formation.bean.Eleve"></jsp:useBean>

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
				<h2>Informations Eleve</h2>
				<hr />
			</div>
		</div>
		

		
		<div class="row">
				<div class="col-sm-4">Nom</div>
				<div class="col-sm-8">
					<jsp:getProperty property="nom" name="Eleve"/>
				</div>
			</div>
			<div class="row">
				<div class="col-sm-4">Prénom</div>
				<div class="col-sm-8">
					<jsp:getProperty property="prenom" name="Eleve"/>
				</div>
			</div>
			<div class="row">
				<div class="col-sm-4">Adresse</div>
				<div class="col-sm-8">
					<jsp:getProperty property="adresse" name="Eleve"/>
				</div>
			</div>
			<div class="row">
				<div class="col-sm-4">Né(e) le</div>
				<div class="col-sm-8">
					<jsp:getProperty property="nele" name="Eleve"/>
				</div>
			</div>
			
		</div>



</body>
</html>