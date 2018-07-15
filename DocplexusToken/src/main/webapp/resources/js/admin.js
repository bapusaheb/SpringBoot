/**
 * 
 */


var app = angular.module('todoApp', []);
app.controller('adminController', function($scope,$http) {
  
	 $scope.getlist = function() {
		
		 $http.get("http://localhost:2222/getCounterList")
		    .then(function(response) {
		    	$scope.counterlist = response.data.data;
		    	$(".getCounterlist").hide();
		    	$(".counterlist").show();
		    	$(".tokenlist").hide();  	
		    });
		
		 
	    };
	    
	
	 
	 $scope.getTokens= function(no) {
		 var parameter = JSON.stringify({counterNo:no});
		 $http.post("http://localhost:2222/getTokenQueue",parameter)
		    .then(function(response) {
		    	$scope.data = response.data.data;
		    	$(".counterlist").hide();
		    	$(".tokenlist").show();  	
		    });
		
		 
	    };
	    
	    $scope.servToken=function(obj) {
	    	 var parameter = JSON.stringify({counterNo:obj.counterNo,tokenNo:obj.list[0]});
	 		
			    $http.post("http://localhost:2222/tokenServiced", parameter).
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