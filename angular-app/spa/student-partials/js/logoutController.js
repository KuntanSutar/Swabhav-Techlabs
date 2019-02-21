studentModule.controller("logoutController", function ($scope,$location, studentService) {
    $scope.logoutForm=function(){ 
      console.log("Inside logout")

      if (sessionStorage.getItem("loggedIn") == "yes") {
        sessionStorage.setItem("loggedIn","no");
        window.location="#/display";
      }
    }
  })