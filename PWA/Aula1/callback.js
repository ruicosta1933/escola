var fs = require("fs");

fs.readFileSync("texto.txt", function (err, data){
    if(err) return console.error(err);
    console.log(data.toString());
});

console.log("Program Ended");