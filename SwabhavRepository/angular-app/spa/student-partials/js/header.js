    studentModule.directive("navBarDirective", function ($rootScope) {
        if ($rootScope.loggedIn == undefined)
            $rootScope.loggedIn = false;
        return {
            templateUrl: "header.html"
        }
    });