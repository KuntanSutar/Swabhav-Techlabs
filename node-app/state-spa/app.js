angular.module("state-app",["ui.router"])
.config(function($stateProvider,$urlRouterProvider) {
    $stateProvider.state('home', {
        url:'home',
        controller:'HomeController',
        templateUrl:'partials/home.html'})

        .state('about', {
        url:'about',
        controller:'AboutController',
        templateUrl:'partials/about.html'})

        .state('career', {
        url:'career',
        controller:'CarrerController',
        templateUrl:'partials/career.html'})

        .state('career.list', {
        url:'/career/list',
        controller:'ListController',
        templateUrl:'partials/list.html',})

        .state('career.summary', {
        url:'/career/summary',
        controller:'SummaryController',
        templateUrl:'partials/summary.html',})

        $urlRouterProvider.otherwise('/home');
        console.log($stateProvider);
        
})