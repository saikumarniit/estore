var myApp  =  angular.module('myApp', []);
myApp.controller('jsonCtrl', function($scope, $http){
	$http.get('resources/employees.json').success(function (data){
		$scope.employees = data;
	});
});
