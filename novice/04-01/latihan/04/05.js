function Animal(name) {

    // this is an object we are about to create
    this.name = name; // add property 'name' with value received from argument

    // add a method on object
    this.getName = function () {
        // here "this" is also the object as function belongs to the object
        return 'Animal name is => ', this.name;
    }
}

// log prototype
console.log(Animal.prototype);