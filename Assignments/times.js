function time(n){
    let sum = 0;
    for(let i=0;i<n;i++){
        sum = sum + i;
    }
    console.log(sum);
}

time(100000000);


function printTime(){
    console.log(new Date().getTime());
}
setInterval(printTime,1000);