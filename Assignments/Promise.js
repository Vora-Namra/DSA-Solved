const fs = require('fs');
function readFile(){
    console.log("Inside Readfile");
    return new Promise(function(res,rej){
        console.log("Inside Promise");
        fs.readFile("a.txt","utf-8",function(err,data){
            res(data);
        })
    })
}

function onDone(data){
    console.log(data);
}

readFile().then(onDone)
        .catch(err=>console.log(err));


let n = new Promise(function(res,rej){
    res("done");
});

n.then(x=>console.log(x));



//Promise Chaining
function promisified(duration){
    const p = new Promise(function(res,rej){
        setTimeout(function(){
            res("done");
        },duration);
    });
    
    return p;
}

promisified(1000).then(function(){
    console.log("First promise done");
    promisified(2000).then(function(){
        console.log("Second promise done");
    })
})