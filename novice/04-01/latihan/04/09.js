function Animal(className) {
    this.className = className;
}

// add method to Animal prototype
Animal.prototype.getClass = function() {
    return 'Animal class is : ' + this.className;
};

function Dog(name) {
    this.name = name;
}

// save Animal prototype in Dog prototype
Dog.prototype = Object.create(Animal.prototype);

// add constructor reference on Dog prototype
Dog.prototype.constructor = Dog;

Dog.prototype.getName = function() {
    return this.name;
}

// create dog object
var d = new Dog('Tommy');

console.log(d);
console.log(d.__proto__);