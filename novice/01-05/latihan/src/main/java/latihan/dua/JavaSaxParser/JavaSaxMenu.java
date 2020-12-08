package latihan.dua.JavaSaxParser;

import java.util.Scanner;
import latihan.App;



public class JavaSaxMenu {
    public static void mulai() {
        int pilihan; 
        Scanner scan = new Scanner(System.in);
        System.out.println("======================================================");
        System.out.println("Java SAX Parser");
        System.out.println("======================================================");
        System.out.println("Silahkan pilih program yang akan dijalankan");
        System.out.println("[1] Java SAX Parser Demo");
        System.out.println("[2] Java SAX Query Parser Demo");
        System.out.println("[3] Java SAX Create XML Demo");
        System.out.println("[4] Java SAX Modify XML Demo");
        System.out.println("[5] Back");
        System.out.println("[6] Exit");
        pilihan = scan.nextInt();

        switch (pilihan) {
            case 1:
                SaxParserDemo o1 = new SaxParserDemo();
                o1.mulai();
                mulai();
                break;
            case 2:
                SaxQueryDemo o2 = new SaxQueryDemo();
                o2.mulai();
                mulai();
                break;
            case 3:
                System.out.println("Not recommended");
                mulai();
                break;
            case 4:
                SaxModifyDemo o4 = new SaxModifyDemo();
                o4.mulai();
                mulai();
            case 5:
                App o5 = new App();
                o5.pilihDua();
                break;
            case 6:
                System.out.println("..:: Terima Kasih ::..");
                System.exit(0);
                break;
            default:
                break;
        }
    }
}