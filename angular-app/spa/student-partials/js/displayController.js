studentModule.controller("displayController",["$scope","studentService",function($scope, studentService) {

    $scope.display = function () {
        var httpPromise = studentService.displayData();
        httpPromise.then(function (response) {
            console.log(response.data);
            $scope.data = response.data;
        });
        httpPromise.catch(function(response){
            alert("Something went wrong");
        })
    }

    $scope.delete = function (sid) {
      if (sessionStorage.getItem("loggedIn") == undefined || sessionStorage.getItem("loggedIn") == "no") {
          window.location="#/login?redirectUrl=display/";
      }
      else {
      var httpPromise = studentService.deleteData(sid);
      httpPromise.then(function (response) {
          //alert("Data Deleted");
          $scope.display();
      });
      httpPromise.catch(function(response){
          alert("Something went wrong");
      })
    }
    };

    $scope.display();

  }])
