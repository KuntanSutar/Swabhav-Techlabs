studentModule.factory("studentService", function($http, studentUrlConstant) {
    var studentData = {};
   studentData.add = function(obj) {
      console.log(obj);
      return $http.post(studentUrlConstant.url,obj);
      
    };
   studentData.displayData = function() {
      return $http.get(studentUrlConstant.url);
    };
   studentData.getStudentById = function (studentId) {
      console.log(studentId);
      return $http.get(studentUrlConstant.url + studentId);
    }
   studentData.updateStudentData = function (Studentobj) {
      return $http.put(studentUrlConstant.url + Studentobj.id, Studentobj)
          .then(function (response) {
              window.location = "#/display";
          })
    }
   studentData.deleteData = function (sid) {
      return $http.delete(studentUrlConstant.url+ sid);
    }
    return studentData;
  })
  .controller("formController", function($scope, studentService) {
    $scope.student = {};
    $scope.addNewStudent = function() {
      var httpPromise = studentService.add($scope.student);
      httpPromise.then(function(response) {
        $scope.student = {};
        window.location = "#/display";
      });
    };
  })
