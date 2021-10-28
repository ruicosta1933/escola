const express = require('express');
const http = require('http');
const mongoose=require('mongoose');

const config = require('./config');
mongoose.connect(db);

const hostname ="127.0.0.1";
const port = 3000;
let router = require ('./router');

var app = express();
app.use(router.initialize());
const server = http.Server(app);

server.listen(port, hostname, () => {
    console.log(`Server running at http://${hostname}:${port}/`);
})