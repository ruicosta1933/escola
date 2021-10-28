const bodyParser = require('body-parser');
const express = require('express');
const Players = require('../data/players');

function PlayerRouter(){
    let router = express();

    router.use(bodyParser.json({limit : '100mb'}));
    router.use(bodyParser.urlencoded({limit: '100mb', extended: true }));

    router.route('/players')
    .get(function(req, res, next){
        console.log('get all Players');
        Players.findAll()
        .then((players) => {
            res.send(players);
            next();
        })
        .catch((err) => {
            next();
        })
        res.send('get all players');
    })
    .post(function(req, res, next){
        console.log('post');
        let body = req.body;
        Players.create(body)
        .then(() => {
            console.log('gravei');
            res.status(200);
            res.send(body);
            next();
        })
        .catch((err) => {
            console.log(err);
            err.status = err.status || 500;
            res.status(401);
            next();
        });
        res.send('post');
    })

router.route('team')
.put(function(req,res){
    console.log('put');
    res.send('put');
})

return router;
}

module.exports = PlayerRouter

