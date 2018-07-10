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
  <h2>Select Your Role</h2>
  <a href="/customer"> Customer</a>
  <a href="/admin"> Banker</a>
</div>

</body>
</html>