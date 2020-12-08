package math.functions;

import java.util.function.Function;
import java.util.Scanner;

public class AppMenu {
    private FunctionMap<Integer, Integer> integerFunctionMap;
    
    public int fungsiKuadrat(int a){
        integerFunctionMap = Functions.intFunctionMap();
        Function<Integer, Integer> fungsiKuadrat = integerFunctionMap.getFunction("square");
        int hasil = fungsiKuadrat.apply(a);
        return hasil;
    }

    public int fungsiAbsolute(int a){
        integerFunctionMap = Functions.intFunctionMap();
        Function<Integer, Integer> fungsiAbsolute = integerFunctionMap.getFunction("absolute");
        int hasil = fungsiAbsolute.apply(a);
        return hasil;
    }

    public int fungsiIncrement(int a){
        integerFunctionMap = Functions.intFunctionMap();
        Function<Integer, Integer> fungsiIncrement = integerFunctionMap.getFunction("increment");
        int hasil = fungsiIncrement.apply(a);
        return hasil;
    }

    public int fungsiDecrement(int a){
        integerFunctionMap = Functions.intFunctionMap();
        Function<Integer, Integer> fungsiDecrement = integerFunctionMap.getFunction("decrement");
        int hasil = fungsiDecrement.apply(a);
        return hasil;
    }

    public int fungsiSignum(int a){
        integerFunctionMap = Functions.intFunctionMap();
        Function<Integer, Integer> fungsiSignum = integerFunctionMap.getFunction("signum");
        int hasil = fungsiSignum.apply(a);
        return hasil;
    }

    public void menu() {
        int pilihan, i;
        Scanner scan = new Scanner(System.in);
        System.out.println("==============================");
        System.out.println("Math Functions");
        System.out.println("==============================");
        System.out.println("[1] Square Function");
        System.out.println("[2] Increment Function");
        System.out.println("[3] Decrement Function");
        System.out.println("[4] Absolute Function");
        System.out.println("[5] Signum Function");
        System.out.println("[6] Back");
        System.out.println("[7] Exit");
        System.out.println("Masukkan pilihan Anda");
        pilihan = scan.nextInt();
        System.out.println("Masukkan bilangan bulat");
        i = scan.nextInt();
        switch (pilihan) {
            case 1:
                
                
                System.out.println(fungsiKuadrat(i));
                this.menu();
                break;
            case 2:
                System.out.println(fungsiIncrement(i));
                this.menu();
                break;
            case 3:
                System.out.println(fungsiDecrement(i));
                this.menu();
                break;
            case 4:
                System.out.println(fungsiAbsolute(i));
                this.menu();
                break;
            case 5:
                System.out.println(fungsiSignum(i));
                this.menu();
                break;
            case 6:
                App.mainMenu();
                break;
            case 7:
                System.out.println("Terima Kasih");
                System.exit(0);
            default:
                System.out.println("Angka yang Anda masukkan tidak valid");
                this.menu();
                break;
        }
    }
}

