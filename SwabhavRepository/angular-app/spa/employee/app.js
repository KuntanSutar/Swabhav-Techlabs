angular.module("SwabhavTechLab", ["ui.router"])
    .config(
        function ($stateProvider, $urlRouterProvider) {
            $stateProvider
                .state('form', {
                    url: '/form',
                    templateUrl: 'partialEmployee/form.html',
                    controller: 'employeeController'
                })
                .state('display', {
                    url: '/display',
                    templateUrl: 'partialEmployee/display.html',
                    controller: 'employeeController'
                })
            $urlRouterProvider.otherwise('/form')
        })
    .factory("employeeService", function ($http) {
        return {
            httpPromise: $http({
                method: 'GET',
                url: 'https://swabhav-tech.firebaseapp.com/emp.txt'
            }),

            remove: function (employeeID, empArray) {
                var ask = confirm("Do you want to delete?");
                if (ask) {
                    for (var i = 0; i < empArray.length; i++) {
                        if (employeeID == empArray[i].EmpId) {
                            empArray.splice(i, 1);
                        }
                    }
                }
            },


            parse: function (response) {
                var i;
                var strArray = response.data.split("\n");

                for (i = 0; i < strArray.length; i++) {
                    strArray[i] = strArray[i].replace(/\s+/g, "");
                }
                var strArray = strArray.filter(function (value, index, self) {
                    return self.indexOf(value) === index;
                });
                console.log(strArray);

                var objArray = [];
                for (i = 0; i < strArray.length; i++) {
                    var row = strArray[i].split(",");
                    var obj = {
                        EmpId: row[0],
                        Name: row[1].replace(/'/g, ""),
                        Designation: row[2].replace(/'/g, ""),
                        ManagerId: row[3],
                        Date: row[4].replace(/'/g, ""),
                        Salary: row[5],
                        Commission: row[6],
                        DepartmentNumber: row[7]
                    };
                    objArray.push(obj);
                    console.log(obj);
                }
                return objArray;
            }
        };
    });