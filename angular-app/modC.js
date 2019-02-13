angular.module('modC', [])
    .controller('controllerC', function ($scope, $rootScope) {
        console.log("Inside Controller C");
        $scope.controllerC = {
            message: "Controller C says Hello"
        }
        console.log($rootScope);
        $rootScope.company = "Aurionpro";
    });