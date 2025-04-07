console.log("sync1");

setTimeout(()=>{
    console.log('setTimeout ');
},10000)


console.log("sync2")


let a =1;
for(let i=0;i<100;i++){
    a++;
}


console.log(a);


setTimeout(function(){
    console.log('setTimeout outer ')
    setTimeout(function(){
        console.log('setTimeout inner ')
    },3000)
    console.log("settimeout outer2")
},3000);

//sync code gets executed immediately &
//  Async code gets into Web Apis & once it gets finished it will be shifted to Callback queue & 
// when cpu gets idle after executing all the synchronous code it will execute particular async code from callback queue


