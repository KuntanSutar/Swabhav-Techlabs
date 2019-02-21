console.log("Hello inside Nodejs");
console.log(this);
//console.log(window);
console.log(global);
console.log(this==global);
//console.log(location);
//console.log(document);
let foo = "Hello foo";
console.log(this);
console.log(global.foo);
console.log(foo);

setTimeout(()=>{
    console.log("After 3 seconds "+foo);
}, 3000);