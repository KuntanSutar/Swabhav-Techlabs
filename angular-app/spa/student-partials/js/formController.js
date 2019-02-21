studentModule.controller("formController", function($scope, studentService) {
    $scope.student = {};
    $scope.addNewStudent = function() {
      var httpPromise = studentService.add($scope.student);
      httpPromise.then(function(response) {
        $scope.student = {};
        window.location = "#/display";
      });
    };
  })