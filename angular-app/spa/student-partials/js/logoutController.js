studentModule.controller("logoutController", function ($scope,$rootScope, $location, studentService) {
      console.log("Inside logout")

      if (sessionStorage.getItem("loggedIn") == "yes") {
        sessionStorage.setItem("loggedIn","no");
        $rootScope.loggedIn=false;
        window.location="#/display";
      }
  })