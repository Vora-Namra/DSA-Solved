const arr= [10,35,1,94,23,56];
let max = 0;
for(let i =0;i<arr.length;i++){
    if(arr[i] > max){
        max = arr[i];
    }
}

console.log(max);