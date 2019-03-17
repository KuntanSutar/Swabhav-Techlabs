interface ICustomer {
    firstName: string,
    lastName: string,
    salary: number
}

printDetails([{firstName:"kuntan", lastName:"sutar", salary:2000},{firstName:"kiran", lastName:"mohite", salary:25000}])

function printDetails(customers:ICustomer[]) {
    
    customers.forEach(function(customer) {
        console.log(customer.firstName+"..."+customer.lastName+"..."+customer.salary)
    })
    for(let i of customers) {
        console.log(i)
    }
}