/* let myHeading = document.querySelector('h1');
myHeading.textContent = 'Hello world!';



for (let coba = "#";coba.length<=7;coba = coba+"#") {
    console.log(coba);
}

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
 */

 let size = 8;
 let co = "A"
 for (let i = 1; i <= size; i++) {

    
    if (i%2==0) {
        console.log(co=co+"A")
    } else {
        console.log(co=co+"B")
    }
    

    for(let j = 1; j <= size; j++) {
        if (i%2==0) {
            console.log(co=co+"A")
        } else {
            console.log(co=co+"B")
        }
    }
    
    
 }