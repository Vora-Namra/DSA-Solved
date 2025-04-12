const zod = require('zod');
const express = require("express");

const app = express();

app.use(express.json());

const schema = zod.object({
    email:zod.string().email(),
    password:zod.string().min(8)
})

app.post('/',function(req,res){
    const result = req.body;
    const validate = schema.safeParse(result);
    if(validate.success){
        return res.json({
            msg:"Input is valid"
        })
    }else{
        return res.json({
            msg:"Input is invalid"
        })
    }
})

app.listen(3000);