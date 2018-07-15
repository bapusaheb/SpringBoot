/**
 * 
 */


var app = angular.module('todoApp', []);
app.controller('tokenController', function($scope,$http) {
  
	 $scope.addRecord = function() {
		 if($scope.customerID==="")
		 { alert("Enter customer id");
		 	return;
		 }else{
		 var parameter = JSON.stringify({id:$scope.customerID});
		 $scope.customerID="";
		 
		    $http.post("http://localhost:2222/generateToken", parameter).
		    then(function(response, status, headers, config) {
		    		$scope.data = response.data.data;
		    		$scope.customerID="";
		    		$(".tokeninfo").show();
		      });
		 }
	    };
	     
});