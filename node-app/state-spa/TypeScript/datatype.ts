const employeeName:string="kuntan"
const companyName:string="Aurionpro"
const age:number=21
const isMale:boolean=true
const address='Goregaon'

const details = `Employee Name is ${employeeName} 
                        Employee is from ${companyName}
                                Employee is ${age} years old
                                        Employee gender is ${isMale}
                                                Employee lives in ${address}`

displayDetails(details);

function displayDetails(data:string):void{
    console.log(data);
}

