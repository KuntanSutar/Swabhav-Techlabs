angular.module("swabhav-spa-app",["ngRoute"])
.config(function($routeProvider) {
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
    })  
.factory("studentService", function($http, studentUrlConstant) {
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

  .controller("displayController",["$scope","studentService",function($scope, studentService) {

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
  .controller("editController",["$scope","$routeParams","studentService",function($scope,$routeParams,studentService) {
    
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
  
  .controller("loginController", function ($scope,$location, studentService) {
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

  .controller("logoutController", function ($scope,$location, studentService) {
    $scope.logoutForm=function(){ 
      console.log("Inside logout")

      if (sessionStorage.getItem("loggedIn") == "yes") {
        sessionStorage.setItem("loggedIn","no");
        window.location="#/display";
      }
    }
  })

  .directive("navBarDirective", function() {
  return {
      templateUrl : "header.html"
  }})
  
  .constant("studentUrlConstant", {
    url:"http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/"
  })

  .directive("studentFormFooter", function() {
    return {
      templateUrl : "footer.html"
    }
  })