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
<div class="row">
		<div class="container">
			<div class="jumbotron customerid">
				<h2>Enter your customer id to generate token</h2>
				<input type="text" ng-model="description" id="myInput"
					placeholder="Cutomer Id"> <span ng-click="addRecord()"
					class="addBtn">Generate</span>
	
			<br>
			</div>
			
			<div class="jumbotron tokeninfo" style="display: none;">
				<h2>Your token no is: <span id=tokenNo> 1 </span> </h2>
				<h2>and counter no is: <span id=counterNo> 1</span> </h2>
				
			<br>
			<h4><a href="/"> Go back to home page</a> </h4>
			</div>
		
			
		</div>

</div>

</body>
</html>