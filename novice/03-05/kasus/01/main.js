document.writeln("Membuat MATRIKS")
document.writeln("<pre>");document.writeln("</pre>")    

var matriksA = new Array (2);
matriksA[0]=new Array(2);matriksA[1]=new Array(2);
matriksA = [
    [1,2],
    [3,4]    
];

document.writeln("Matriks A");
document.writeln("<pre>");document.writeln("</pre>")
    
    for (let i = 0; i < matriksA[0].length; i++) {
        document.write("|");
        for (let j = 0; j < matriksA.length; j++) {
            document.writeln(" "+matriksA[i][j]+" ");
            
        }
        document.write("|");
        document.writeln("<pre>");document.writeln("</pre>")
    }

var matriksB = new Array (2);
matriksB[0]=new Array(2);matriksB[1]=new Array(2);
matriksB = [
    [5,6],
    [7,8]
];

document.writeln("Matriks B");
document.writeln("<pre>");document.writeln("</pre>")

    for (let i = 0; i < matriksB[0].length; i++) {
        document.write("|");
        for (let j = 0; j < matriksB.length; j++) {
            document.writeln(" "+matriksB[i][j]+" ");
            
        }
        document.write("\t|");
        document.writeln("<pre>");document.writeln("</pre>")
    }

var hasilJumlah = new Array (2);
hasilJumlah[0]=new Array(2);hasilJumlah[1]=new Array(2);

document.writeln("Hasil jumlah Matriks A dan Matriks B")
document.writeln("<pre>");document.writeln("</pre>")

    for (let i = 0; i < matriksA[0].length; i++) {
        document.write("|");
        for (let j = 0; j < matriksA.length; j++) {
            hasilJumlah[i][j]=matriksA[i][j]+matriksB[i][j];
            document.writeln(" "+hasilJumlah[i][j]+" ");
            
        }
        document.write("\t|");
        document.writeln("<pre>");document.writeln("</pre>");
    }