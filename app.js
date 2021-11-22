var http = require('http');
http.createServer((req, res)=>{
    res.writeHead(200,{'Content-Type': 'text'});
    res.write('<h1>I am a big old baddy<h1>');
    res.end("hello world");
}).listen(8080);