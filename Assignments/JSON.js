const user = {
    name: 'John Doe',
    age: 30,
    occupation: 'Software Engineer',
}

const str = '{"name":"John Doe","age":30,"occupation":"Software Engineer"}';

console.log(JSON.stringify(user));

console.log(JSON.parse(str));
console.log(Object.keys(user));
console.log(Object.values(user));
console.log(Object.entries(user));
console.log(user.hasOwnProperty("name"));



//Math func

console.log(Math.ceil(2.6));
console.log(Math.floor(5.3))
console.log(Math.max(2,5,29));
console.log(Math.min(2,5,29));