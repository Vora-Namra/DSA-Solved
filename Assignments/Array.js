const init = [1,2,3];
const second = [4,5,6];

for(let i=0;i<init.length;i++){
    console.log(init[i]);
}
console.log("Alternate way to iterate array");


init.forEach((e)=>console.log(e))

let final = init.concat(second);

console.log(final);



//Date TIme Month year Minutes Hour second
const crntDate = new Date();

console.log(crntDate);
console.log(crntDate.getDate());
console.log(crntDate.getMonth()+1);
console.log(crntDate.getFullYear());
console.log(crntDate.getHours());
console.log(crntDate.getMinutes());
console.log(crntDate.getSeconds());