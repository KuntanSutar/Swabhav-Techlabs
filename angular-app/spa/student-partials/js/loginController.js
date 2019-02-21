studentModule.controller("loginController", function ($scope,$location, studentService) {
    $scope.loginForm=function(){

        if($scope.username=="kuntan" && $scope.password=="ace8051micro"){

            console.log("login successful");
            sessionStorage.setItem("loggedIn","yes");
            window.location = `#/${$location.search().redirectUrl}`;
            
        }else{
            alert("Login Failed");
        }
    }
  })