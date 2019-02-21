studentModule.controller("editController",["$scope","$routeParams","studentService",function($scope,$routeParams,studentService) {
    
    $scope.edit = function () {

      if (sessionStorage.getItem("loggedIn") == undefined || sessionStorage.getItem("loggedIn") == "no") {
          window.location=`#/login?redirectUrl=edit/${$routeParams.UID}`;
      }
      else {
          var httpPromise = studentService.getStudentById($routeParams.UID);
          httpPromise.then(function (response) {
              var obj = response.data[0];
              obj.date = new Date(obj.date);
              obj.isMale = obj.isMale + "";
              $scope.student = obj;
              console.log($scope.student);
          });
      }
    };

    $scope.editStudentData = function () {
        studentService.updateStudentData($scope.student);
    }
    $scope.edit();

  }])