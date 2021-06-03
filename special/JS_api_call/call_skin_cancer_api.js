var request = require('request');
var fs = require('fs');

let formData = {
    image : fs.createReadStream(__dirname + '/2.jpg')
}

request.post({url:'https://skin-cancer-detection-api351.herokuapp.com/upload',formData},(err,res,body)=>{
    console.log(res);
});