const input = [1,2,3,4,5,6];


//filter 
const arr =  input.filter(x=>x%2 ==0);
console.log(arr);

//Another way
function evenLogic(i){
    return i%2 == 0;
}
const ans = input.filter((i)=>evenLogic(i));
console.log(ans);

const input2 = ["namra","nick","priya","kinjal","drishti"];
function filterfunc(i){
    if(i.startsWith("n")){
        return true;
    }else{
        return false;
    }
}
const res = input2.filter(x=>filterfunc);
console.log(res);