const fs = require('fs');
function readFile(){
    console.log("Inside Readfile");
    return new Promise(function(res){
        console.log("Inside Promise");
        fs.readFile("a.txt","utf-8",function(err,data){
            res(data);
        })
    })
}

function onDone(data){
    console.log(data);
}

readFile().then(onDone);