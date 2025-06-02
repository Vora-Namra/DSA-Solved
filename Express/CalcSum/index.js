const express = require("express");
const jwt = require("jsonwebtoken");
const app =express();
app.use(express.json());
const jwt_secret = "123456";

function isold(age){
    if(age>=14){
        return true;
    }else{
        return false;
    }
}

app.get("/",(req,res)=>{
    if(isold(req.query.age)){
        res.json({
            msg:"success"
        })
    }else{
    res.json({
        msg:"failed"
    })
    }
})


function isold2(req,res,next){
    const age = req.query.age;
    if(age>14){
        next();
    }else{
        return res.json({
            msg:"not allowed"
        });
    }
}

app.get("/ride",isold2,(req,res)=>{
    console.log("welcome")
    return res.json({
        msg:"hello"
    })
})

app.listen(3000);
