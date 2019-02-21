class Customer{
    constructor(firstname, lastname) {
        this.firstname=firstname;
        this.lastname=lastname;
    }
    get fullName() {
        return this.firstname+"..."+this.lastname;
    }
}
let customer1=new Customer("Kuntan","Sutar");
console.log(customer1.fullName);
console.log(customer1);
//console.log(customer1.__proto__==Customer.prototype);

module.exports=Customer;