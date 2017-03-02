var taskManagerModule = angular.module('orderMisionManagerApp', []);

taskManagerModule.controller('orderMisionManagerController', function ($scope,$http) {
	
	var urlBase="";
	$http.defaults.headers.post["Content-Type"] = "application/json";


	//add a new colab
	$scope.addCollab = function addCollab() {
		if($scope.collabName=="" || $scope.collabFirstName=="" || $scope.date == "" || $scope.project == ""  || $scope.agency == ""){
			alert("Insufficient Data! Please provide values for task name, description, priortiy and status");
		}
		else{
		 $http.post(urlBase + '/collaboraters', {
             collabName: $scope.collabName,
             collabFirstName: $scope.collabFirstName,
             date: $scope.date,
             project: $scope.project,
             agency: $scope.agency
         }
	
		 ).
		  success(function(data, status, headers) {
			 alert("Colab added");
             var newColabUri = headers()["location"];
             console.log("Might be good to GET " + newColabUri + " and append the task.");
		    });
		}
	};

	
});