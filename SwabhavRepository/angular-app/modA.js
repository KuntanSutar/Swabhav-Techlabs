angular.module('modA', ['modB', 'modC'])
    .controller('controllerA', function ($scope, $rootScope) {
        console.log("Inside Controller A");
        $scope.controllerA = {
            message: "Controller A says Hello"
        }
        console.log($rootScope);
        $rootScope.company = "Aurionpro";
    });