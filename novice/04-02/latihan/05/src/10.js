// Generators

function* powers(n) {
    for (let current = n;; current *= n) {
      yield current;
    }
  }
  
  for (let power of powers(3)) {
    if (power > 50) break;
    console.log(power);
  }
  // → 3
  // → 9
  // → 27

  Group.prototype[Symbol.iterator] = function*() {
    for (let i = 0; i < this.members.length; i++) {
      yield this.members[i];
    }
  };