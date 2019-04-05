angular.module("swabhav-spa-app",["ngRoute"])
.config(function($routeProvider) {
    $routeProvider.when('/',{
        templateUrl:'partials/home.html',
        controller:'HomeController'})
        .when('/home', {
        templateUrl:'partials/home.html',
        controller:'HomeController'})
        .when('/about',{
        templateUrl:'partials/about.html',
        controller:'AboutController'})
        .when('/career',{
        templateUrl:'partials/career.html',
        controller:'CarrerController'})
})