function Animal (name) {
    this.name = name;
}

// add simple property on prototype
Animal.prototype.generation = '100';

// create object
var a = new Animal('Dog');

console.log('a.generation ==> ', a.generation);

console.log('has own generation ==> ', a.hasOwnProperty('generation'));