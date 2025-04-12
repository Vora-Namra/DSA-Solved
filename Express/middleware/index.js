//middleware using express functionality
const express = require("express");
const zod = require("zod");
const app =express();
app.use(express.json());


const schema = zod.object({
    email:zod.string().email(),
    password:zod.string().min(8),
});


function userMiddleware(req,res,next){

    console.log("Hii");
    next();
    // console.log("middleware 1");
    // const username = req.headers.name;
    // const pass  = req.headers.pass;
    // if(username != "admin" && pass != "123"){
    //     return res.status(400).json({
    //         msg:"not allowed"
    //     })
    // }else{
    //     next();
    // }
}


// function kidneyMiddlewaew(req,res,next){
//     console.log("middleware 2");
//     const kidney = req.query.kidney;
//     if(kidney != 1 && kidney !=2){
//         res.status(400).json({
//             msg:"Input is invalid"
//         })
//     }
//     else{
//         next();
//     }
// }


app.get("/health-check",(req,res)=>{
    const kidney = req.body;
    const response = schema.safeParse(kidney);
    return res.json({
        response
    });
})


app.listen(3000);