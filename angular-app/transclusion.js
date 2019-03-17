angular.module('swabhav', [])
    .controller('transclusionController', ['$scope', function ($scope) {
        
    }])
    .directive('messageDirective', function() {
        return {
            templateUrl: 'message.html',
            transclude: true
        }
    })