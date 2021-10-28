const express = require('express');
const app = express();
const routes = require('./router.js')

app.use(express.json());
app.use(routes);

app.get('/');

app.listen(3333, () => {
    console.log(`Server esta correndo`);
});