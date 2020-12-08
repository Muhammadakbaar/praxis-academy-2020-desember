console.log("Kasus 1: Looping a triangle")

	for (let k1 = "#";k1.length<=7;k1+="#") {
		console.log(k1);
	} 
	 
console.log("Kasus 2: FizzBuzz")

	for (let i = 1;i<=100;i = i+1) {
		if ((i%3==0)&&(i%5==0)) {
			console.log("FizzzBuzzz")
		} else if (i%3==0) {
			console.log("Fizzzz")
		} else if (i%5==0) {
			console.log("Buzzz")
		} else {
			console.log(i)
		}
	} 

console.log("Kasus 3: Chessboard") 
	
	let coba = "";
	let size = 8;
	for (let baris = 1; baris <= size; baris++) {
				
		for(let kolom = 1; kolom <= size; kolom++) {
			let total=baris+kolom;
			if(total%2==0) {
				coba +=" ";
			} else {
				coba+="#";
			}
		}
		coba+="\n";   
	}
	console.log(coba)