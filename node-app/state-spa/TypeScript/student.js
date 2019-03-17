"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var Student = /** @class */ (function () {
    function Student(firstName, lastName, cgpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cgpa = cgpa;
    }
    Object.defineProperty(Student.prototype, "details", {
        get: function () {
            return "Student name is " + this.firstName + " " + this.lastName + " Student cgpa is " + this.cgpa;
        },
        enumerable: true,
        configurable: true
    });
    return Student;
}());
exports.Student = Student;
var student1 = new Student("kuntan", "sutar", 6.75);
console.log(student1.details);
