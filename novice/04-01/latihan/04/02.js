var mike = {name : 'Mike'};
var odd = [1];
var morning = function() {return "Greetings!"}
morning.info = 'Morning greeting function';

var evening = morning;
var john = mike;
var even = odd;

var kate = mike;
kate = {name : 'Kate'};

evening.info = 'Evening greeting function';
john.name = 'John';
even[0] = 1;

console.log('first ==> ', morning.info, mike, odd);
console.log('second ==> ', evening.info, john, even);