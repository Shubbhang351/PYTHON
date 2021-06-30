const fs = require('fs');
const request = require('request');

let formData = {
    image: fs.createReadStream(__dirname + '/4.jpg')
};

// request.post('https://skin-cancer-detection-api351.herokuapp.com/upload', {formData: formData},  function(err, res, body) {
//     let json = JSON.parse(body);
//     console.log(json);
//     });

request.get('https://skin-cancer-detection-api351.herokuapp.com/',(err, res,body) => {
    console.log(res);
})