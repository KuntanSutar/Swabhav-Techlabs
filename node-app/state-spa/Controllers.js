angular.module('state-app')
    .controller('HomeController',function($scope) {
        console.log("Inside HomeController");
        $scope.data="HomeController called";
    })
    .controller('AboutController',function($scope) {
        console.log("Inside AboutController");
        $scope.data="AboutController called";
    })
    .controller('CarrerController',function($scope) {
        console.log("Inside CarrerController");
        $scope.data="CarrerController called";
    })
    .controller('ListController',function($scope) {
        console.log("Inside ListController");
        $scope.data="ListController called";
    })
    .controller('SummaryController',function($scope) {
        console.log("Inside SummaryController");
        $scope.data="SummaryController called";
    })