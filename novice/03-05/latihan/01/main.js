// Minimum

function min(a, b) {
 	if (a > b) {return b;}
  	else {return a;}
}

console.log(min(0, 10));
// → 0
console.log(min(0, -10));
// → -10


// Recursion

function isEven(a) {
 	 if (a == 0) {
      	return true; 
     } else if (a == 1) {
      	return false; 
     } else if (a < 0) {
      	return isEven(a+2); 
     } else {
  		return isEven(a-2);     
     }
  
}

console.log(isEven(50)); 
// → true
console.log(isEven(75));
// → false
console.log(isEven(-1));
// → false

// Bean Counting

function countBs(a) {
	let counter = 0;
	for (let i = 0; i < a.length; i++) {
		if ((a[i]=="B")||(a[i]=="b")) {
			counter ++;
		} 
		
	}
	return counter;
}

function countChar(a, b) {
	let counter = 0;
	for (let i = 0; i < a.length; i++) {
		if ((a[i]==b)) {
			counter ++;
		} 
		
	}
	return counter;
}

console.log("Huruf b/B ada: "+countBs("BBC"))
console.log(countChar("kakkerlak", "k"));