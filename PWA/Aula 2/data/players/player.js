let mongoose = require('mongoose');
let Schema = mongoose.Schema;

//criar Schema
let PlayerSchema = new Schema({
    name : {type: String, required: true, unique: true},
    lastName : {type:String, required: true},
});

//criar modelo a usar o Schema

let Player = mongoose.model('User', PlayerSchema);

//colocar disponivel para os utilizadores da app

module.exports = Player;