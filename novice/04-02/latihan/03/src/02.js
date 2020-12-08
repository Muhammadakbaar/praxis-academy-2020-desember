// Non blocking example using callback function

console.log("Getting Data1");
getData('123', function(data1) {
  console.log("Data is:", data1);
});

console.log("Getting Data2");
getData('456', function(data1) {
  console.log("Data is:", data1);
});

var sum = 1 + 2;
console.log("sum is:", sum);
