
const input = [1,2,3,4,5,6];

//Without Map 
const newArr =  [];
for(let i=0;i<input.length;i++){
    newArr.push(input[i]*3);
}



//Map Impl
const newArr2 = input.map((x)=>x*3);
console.log(newArr);



//Alternate way of Map
function transform(i){
    return i*3;
}
const newArr3 = input.map(transform);
console.log(newArr3);


//another way
const newArr4 = input.map(input,transform);
console.log(newArr4)

