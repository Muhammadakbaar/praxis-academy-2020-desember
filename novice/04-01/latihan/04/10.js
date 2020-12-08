function Animal(className) {
    this.className = className;
}

// add method to Animal prototype
Animal.prototype.getClass = function() {
    return 'Animal class is : ' + this.className;
}

function Dog(name) {

    // execute parent constructor
    Animal.call(this, 'Animal');
    this.name = name;
}

Dog.prototype = Object.create(Animal.prototype);

Dog.prototype.constructor = Dog;

Dog.prototype.getName = function () {
    return this.name;
}

var d = new Dog('Tommy');

console.log(d);
console.log(d.getClass());