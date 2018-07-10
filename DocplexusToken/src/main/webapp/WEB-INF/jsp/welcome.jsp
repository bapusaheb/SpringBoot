<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <link rel="stylesheet" href="resources/todoList.css">
  <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
  <script src="resources/js/toDoList.js"></script>
<title>Insert title here</title>
</head>
<body ng-app="todoApp" ng-controller="appController">

<div class="header">
  <h2>My To Do List</h2>
  <input type="text" ng-model="description" id="myInput" placeholder="Title...">
  <span ng-click="addRecord()" class="addBtn">Add</span>
</div>


<ul >
  <li  ng-repeat="obj in data"  ng-class="{ 'checked': obj.status=='Completed' }">
 	{{obj.description}}  <span  ng-class="{ 'tikMark': obj.status=='Pending' }" ng-click="markAsDone(obj)">Mark Done</span> <span class="close" ng-click="deleteRecord(obj)">×</span>
 	</li>
</ul>


</body>
</html>