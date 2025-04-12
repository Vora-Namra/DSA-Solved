//middleware checkup using manual setup
const express = require("express");

const app =express();

app.get("/health-check",(req,res)=>{
    const username = req.headers.name;
    const pass  = req.headers.pass;
    const kidney = req.query.kidney;
    if(username != 'admin' && pass != '123'){
        return res.status(400).json({
            msg:"not allowed"
        })
    }
    if(kidney != 1 && kidney !=2){
        res.status(400).json({
            msg:"Input is invalid"
        })
    }
    return res.json({
        msg:"Kidney is fine"
    });
})


app.listen(3000);