let mongoose = require('mongoose');
let Schema = mongoose.Schema;

let Hobbies = new Schema({
    name : {type : String , required : true },
})

//criar Schema
let PlayerSchema = new Schema({
    name : {type: String, required: true, unique: true},
    lastName : {type:String, required: true},
    hobbies : [{type : Hobbies}]
});

//criar modelo a usar o Schema

let Player = mongoose.model('User', PlayerSchema);

//colocar disponivel para os utilizadores da app

module.exports = Player;