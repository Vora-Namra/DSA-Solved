//index lastindexof
function find(str,target){
    console.log("Original :",str);
    console.log("Index :",str.lastIndexOf(target));
    console.log(str.length);
}
find("hello world world world","world");


//slice,substr
function getSlice(str,start,end){
    console.log("Original :",str);
    console.log("Substring :",str.slice(start,end));
    console.log("Slice :",str.substr(start,end));
    
}
getSlice("hello world world world",2,10);



//replace
const st = "hii there";
console.log(st.replace("h","t"));

//split- to extract all the words from String & store in array form
const val = "hey, how are you doing";
const words = val.split(",");
const parts = val.split(" ");
console.log(words);
console.log(parts);


//trim uppercase lowercase
const name = "   vijAy sHah    ";
console.log(name.trim());
console.log(name.toUpperCase());
console.log(name.toLowerCase());




console.log(parseInt("42"));
console.log(parseInt("s2scdscscx"));
console.log(parseInt("5cdscscx"));
console.log(parseFloat("42.42"));

