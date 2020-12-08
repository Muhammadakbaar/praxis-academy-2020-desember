function Animal(name) {
    this.name;

    this.getName = function() {
        return 'Animal name is => '+this.name;
    }
}

var a = new Animal('Dog');
console.log('a object ==> ', a);
console.log('a.getName() ==> ', a.getName());
console.log('a.constructor === Animal ', a.constructor === Animal);