import { Component } from '@angular/core';
import { IStudent } from './IStudent';

@Component({
  selector: 'sw-student',
  templateUrl: './student.component.html'
})
export class StudentComponent {
  private student: IStudent
  private message: string= "Hoisting is JavaScript's default behavior of moving declarations to the top."
  private imageWidth: number= 100
  private imageHeight: number= 100
  private imageSource: string= "../../assets/image.jpg"
  private courses: string[]= []

  constructor() {
    this.student= {cgpa: 6.75, studentName: "kuntan", job: "java developer", company: "Aurionpro"}
  }
  public get setCGPAToColorProperty() {
    return this.student['cgpa']>7 ? 'red' : 'green'
  }
  public loadCourses() {
    console.log("Button Clicked")
    this.courses=["Java", "Angular", "Node.js", "Spring", "Hibernate"]
/*     this.courses.push("Java")
    this.courses.push("Angular")
    this.courses.push("Node.js")
    this.courses.push("Spring")
    this.courses.push("Hibernate") */
  }
}
