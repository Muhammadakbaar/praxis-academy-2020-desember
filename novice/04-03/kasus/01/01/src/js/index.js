var div = document.querySelector('div');
var WIDTH = window.innerWidth;
var HEIGHT = window.innerHeight;

div.style.width = WIDTH + 'px';
div.style.height = HEIGHT + 'px';


window.onresize = function() {
    WIDTH = window.innerWidth;
    HEIGHT = window.innerHeight;
    this.div.style.width = WIDTH + 'px';
    this.div.style.height = HEIGHT + 'px';
}