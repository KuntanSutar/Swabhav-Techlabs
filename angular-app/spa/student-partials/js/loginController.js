studentModule.controller("loginController", function ($scope,$location, $rootScope, studentService) {
    $scope.loginForm=function(){

        if ($scope.username == "kuntan" && $scope.password == "ace8051micro") {
            $rootScope.loggedIn = true;
            $rootScope.person = $scope.username;
            console.log("Inside login");
            sessionStorage.setItem("loggedIn", "yes");
            if ($location.search().redirectUrl != undefined) {
                window.location = `#/${$location.search().redirectUrl}`;
            } else {
                $scope.username = "";
                $scope.password = "";
            }
        
        } else {
            alert("Login Failed");
        }
    }
  })


  