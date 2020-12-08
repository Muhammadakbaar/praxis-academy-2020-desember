const _ = require("lodash")

const isEven = n => n % 2 === 0;
const numbers = [5, 4, 3, 2, 1];


console.log(_.filter(numbers, isEven));
console.log(_.find(numbers, isEven));
const printXPlusFive = x => console.log(x + 5);
_.forEach(numbers, printXPlusFive);