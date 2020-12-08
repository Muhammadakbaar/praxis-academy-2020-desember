const R = require('ramda');

const isEven = n => n % 2 === 0;
const numbers = [5, 4, 3, 2, 1];

console.log(R.filter(isEven, numbers));
console.log(R.find(isEven, numbers));

const printXPlusFive = x => console.log(x + 5);
R.forEach(printXPlusFive, numbers);