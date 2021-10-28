const express = require("express");

router.route('/players')
    .get(function(req, res){
        console.log('get');
        res.send('get');
    })
    .post(function (req, res){
        console.log('post');
        res.send('post');
    });

router.route('/team')
    .put(function(req, res){
        console.log('put');
        res.send('put')
    });

    module.exports= PlayerRouter;
