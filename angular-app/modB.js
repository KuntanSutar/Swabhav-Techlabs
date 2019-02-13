angular.module('modB', [])
    .controller('controllerB', function ($scope, $rootScope) {
        console.log("Inside Controller B");
        $scope.controllerB = {
            message: "Controller B says Hello"
        }
        console.log($rootScope);
        $rootScope.company = "Aurionpro";
    });