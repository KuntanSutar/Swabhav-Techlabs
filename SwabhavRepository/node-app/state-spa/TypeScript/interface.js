printDetails([{ firstName: "kuntan", lastName: "sutar", salary: 2000 }, { firstName: "kiran", lastName: "mohite", salary: 25000 }]);
function printDetails(customers) {
    customers.forEach(function (customer) {
        console.log(customer.firstName + "..." + customer.lastName + "..." + customer.salary);
    });
    for (var _i = 0, customers_1 = customers; _i < customers_1.length; _i++) {
        var i = customers_1[_i];
        console.log(i);
    }
}
