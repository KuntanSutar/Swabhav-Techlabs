studentModule.config(function($routeProvider) {
    $routeProvider.when('/',{
        templateUrl:'form.html',
        controller:'formController'})
        .when('/form', {
        templateUrl:'form.html',
        controller:'formController'})
        .when('/display',{
        templateUrl:'display.html',
        controller:'displayController'})
        .when('/edit/:UID',{
        templateUrl:'edit.html',
        controller:'editController',})
        .when('/login',{
          templateUrl:'login.html',
          controller:'loginController'})
        .when('/logout', {
          template:'<div></div>',
          controller:"logoutController"
        })
    }) 