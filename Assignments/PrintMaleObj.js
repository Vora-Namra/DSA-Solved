
//Obj
const user1 = {
    name:'john',
    gender:"male"
}


//Array of Objects
const arrObj = [
    {
       name:"namra",
       gender:"male" 
    },
    {
       name:"priya",
       gender:"female",
       metadata:{
        age:21,
        address:"sydney"
       }
    },
    {
       name:"pankaj",
       gender:"male" 
    }
]

console.log(arrObj[1].metadata.age);

//iterate on array of objects
for(let i=0;i<arrObj.length;i++){
    if(arrObj[i].gender == "male"){
        console.log(arrObj[i].name);
    }
}