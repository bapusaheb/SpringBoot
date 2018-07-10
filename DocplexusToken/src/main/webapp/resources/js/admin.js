/**
 * 
 */


var app = angular.module('todoApp', []);
app.controller('adminController', function($scope,$http) {
  
	 $http.get("http://localhost:2222/getAllRecords")
	    .then(function(response) {
	    	$scope.data = response.data.data;
	    });
	
	 
	 $scope.addRecord = function() {
		 var parameter = JSON.stringify({name:"NA",description:$scope.description,status:"Pending"});
		    $http.post("http://localhost:2222/saveOrUpdate", parameter).
		    then(function(response, status, headers, config) {
		    		$scope.data = response.data.data;
		    		$scope.description="";
		      });
		 
	    };
	    
	    $scope.markAsDone=function(obj) {
	    	obj.status="Completed";
			 var parameter = JSON.stringify(obj);
			    $http.post("http://localhost:2222/saveOrUpdate", parameter).
			    then(function(response, status, headers, config) {
			    		$scope.data = response.data.data;
			    		
			      });
			 
		    };
	 
		    $scope.deleteRecord=function(obj) {
		    	 var parameter = JSON.stringify(obj);
				    $http.post("http://localhost:2222/delete", parameter).
				    then(function(response, status, headers, config) {
				    		$scope.data = response.data.data;
				    		
				      });
				 
			    };
    
});