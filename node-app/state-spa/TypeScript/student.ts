export class Student {
    constructor(private firstName, private lastName, private cgpa) {
    }

    get details() {
        return `Student name is ${this.firstName} ${this.lastName} Student cgpa is ${this.cgpa}`
    }
}

let student1 = new Student("kuntan", "sutar", 6.75)
console.log(student1.details)