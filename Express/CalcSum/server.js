const express = require("express");
const jwt = require("jsonwebtoken");
const app =express();
app.use(express.json());
const jwt_secret = "123456";


var users =[{
    username:'namra@gmail.com',
    password:'123456',
    name:"namra"   
},
{
    username:'namra1@gmail.com',
    password:'123456',
    name:"namra1"
},
{
    username:'namra2@gmail.com',
    password:'123456',
    name:"namra2"
}]
function userExists(username,password){
    const userExists =false;
    for(let i=0;i<users.length;i++){
        if(users[i].username == username && users[i].password == password){
            return true;
        }
    }
    return userExists;
}

app.post("/signin",function(req,res){
    const username = req.body.username;
    const password = req.body.password;

    if(!userExists(username,password)){
        return res.json({
            message:"Invalid username or password"
        })
    }
    const token = jwt.sign({username:username},jwt_secret);
    return res.json({
        token
    })
})


app.get("/user",function(req,res){
    const token = req.headers.authorization;
    try{
        const decoded = jwt.verify(token,jwt_secret);
        const username = decoded.username; 
        return res.send(username);
     }catch(err){
        return res.json({
            message:"Invalid token"
        })
     }
})

  
app.get("/",function(req,res){
    const johnkidneys = users[0].kidneys;
    const numOfKidneys = johnkidneys.length;
    let numOfHealthyKidneys = 0;
    for(let i=0;i<numOfKidneys;i++){
        numOfHealthyKidneys = numOfHealthyKidneys + 1;
    }
    const numofUnhealthy = numOfKidneys - numOfHealthyKidneys;
    res.json({
        numOfKidneys,
        numOfHealthyKidneys,
        numofUnhealthy
    })
    console.log(johnkidneys);

})


app.post("/",function(req,res){
    const ishealthy = req.body.ishealthy;
    users[0].kidneys.push({
        healthy:ishealthy
    })
    res.json({
        msg:"Done"
    })
})



app.listen(3000);
