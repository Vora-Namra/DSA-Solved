function demo(a,b,fntoCall){
    fntoCall(a,b);
}

function printsimple(a,b){
    console.log(a,b);
}


function printpretty(a,b){
    console.log("Sum is: ",a+b);
}

setTimeout(()=>demo(1,2,printpretty),1*1000);

