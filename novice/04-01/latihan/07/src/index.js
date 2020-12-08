let PI = 3.14;

const calculateArea = (radius, pi) => radius*radius*pi;

calculateArea(10, PI);

/**
 * Membaca Files
 * Jika fungsi kita membaca file dari luar maka fungsi tersebut tidaklah murni, karena
 * isi dari file tersebut dapat berubah-ubah.
 */
    
const charactersCounter = (text) => 'Character count: ${text.length}';

function analyzeFile(filename) {
    let fileContent = open(filename);
    return charactersCounter(fileContent);
}

/**
 * Generator Angka Acak
 * Fungsi apapun yang bergantung pada generator angka acak bukanlah fungsi murni.
 */
    
function yearEndEvaluation() {
    if (Math.random() > 0.5) {
        return "You get a raise!";
    } else {
        return "Better luck next year!";
    }
}

/**
 * It does not cause any observable side effects
 * Examples of observable side effects include modifying a global objject or a parameter
 * passed by reference.
 * Now we want to implement a function to receive an integer value and return the value
 * increased by 1.
 */
    
let counter = 1;

function increaseCounter(value) {
    return counter = value + 1;
}

increaseCounter(counter);
console.log(counter);

/**
 * Kita punya nilai dari counter. Fungsi tidak murni kita menerima nilai tersebut dan mengubah nilai
 * dari counter menjadi nilai tersebut ditambah dengan satu.
 */

let counter = 1;

const increaseCounter = (value) => value + 1;
increaseCounter(counter);
console.log(counter);

/**
 * Observasi:mutabilitas tidak dianjurkan dalam functional programming.
 * Kita memodifikasi objek global. 
 * We are modifying the global object. But how would we make it pure? Just return the
 * value increased by 1.
 * See that out pure function increaseCounter returns 2, but the counter value is still the
 * same. The function returns the incremented value without altering the value of the
 * variable.
 * 
 * Jika kita mengikuti dua aturan ini, maka kita akan lebih mudah memahami program kita. Sekarang
 * semua fungsi terisolasi dan tidak dapat mempengaruhi bagian lain dalam sistem kita.
 * 
 * Fungsi murni itu stabil, konsisten, dan dapat diprediksi. Jika diberikan parameter yang sama
 * fungsi murni akan selalu mengembalikan hasil yang sama. Kita tidak perlu memikirkan situasi
 * dimana parameter yang sama mengembalikan hasil yang berbeda karena situasi tersebut tidak 
 * akan terjadi.
 * 
 */