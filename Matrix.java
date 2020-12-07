public class Matrix {
    public static void main(String[] args) {
        //declaration
        int [][] number = new int [10][10];

        number [5][5] = 1;
        for (int i=0; i<7; i++){
            number[i][6] = 1;
        }
        for (int i=0; i<10; i++){
            number[i][9] = 1;
        }
        for (int j =0; j < number[0].length; j++){
            for (int i=0; i< number.length; i++){
                System.out.print(number[i][j]);
           }
           System.out.println();   
        }
    }
}
