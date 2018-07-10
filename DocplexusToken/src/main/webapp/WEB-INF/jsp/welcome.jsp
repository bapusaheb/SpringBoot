<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="resources/todoList.css">

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>


<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
<script src="resources/js/toDoList.js"></script>

<title>Insert title here</title>
</head>
<body ng-app="todoApp" ng-controller="appController">

	<div class="header">
		<h2>Token Management System</h2>
	</div>
	<div class="container">
		<div class="jumbotron">
			<h2>Select Your Interface:</h2>
			<h3>
				<a href="/addtoken"> Customer</a>
			</h3>

			<h3>
				<a href="/admin"> Banker</a>
			</h3>
		</div>
	</div>

</body>
</html>