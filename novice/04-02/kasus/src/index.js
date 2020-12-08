const request = require('request');

request('https://api.nasa.gov/planetary/apod?api_key=LnTuc8YWBSgKb9Q5MUN4uRrXSwEPhiv7YkhGlczq', {json: true}, (err, res, body) => {
if (err) {return console.log(err);}
console.log(body.url);
console.log(body.explanation);
});
