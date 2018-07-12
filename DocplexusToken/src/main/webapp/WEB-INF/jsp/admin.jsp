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
<script src="resources/js/admin.js"></script>
<title>Insert title here</title>
</head>
<body ng-app="todoApp" ng-controller="adminController">
	<div class="header">
		<h2>Token Management System</h2>
	</div>
	<div class="container-fluid">
		<div class="container">
			<div class="jumbotron customerid">
				<h2>Branch Name:Pashan</h2>
			</div>

			<div class="jumbotron customerid">
				<button type="button" class="btn btn-primary btn-sm">Get Counter list</button>
			</div>



		<div class="counterlist">
		<ul >
  		<li  ng-repeat="obj in data"  ng-class="{ 'checked': obj.status=='Completed' }">
 		{{obj.counterNumber}}
 		</li>
		</ul>
		
		</div>	
		
		<div class="tokenlist">
		
		<div class="jumbotron customerid">
				<h2>Current Token: <span>{{ctrl.curenttoken}}</span> </h2>
				<button type="button" class="btn btn-primary btn-sm">Next</button>
		</div>
		 <h3>Token list</h3>
		<ul >
  		<li  ng-repeat="obj in data"  ng-class="{ 'checked': obj.status=='Completed' }">
 		{{obj.description}}  <span  ng-class="{ 'tikMark': obj.status=='Pending' }" ng-click="markAsDone(obj)">Mark Done</span> <span class="close" ng-click="deleteRecord(obj)">×</span>
 		</li>
		</ul>
		</div>

		</div>
					<h3 class="center"><a href="/"> Go back to home </a></h3>
	</div>

</body>
</html>