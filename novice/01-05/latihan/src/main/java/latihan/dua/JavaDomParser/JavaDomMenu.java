package latihan.dua.JavaDomParser;

import java.util.Scanner;
import latihan.App;
import latihan.dua.JavaDomParser.CreateXmlFileDemo;
import latihan.dua.JavaDomParser.DomParserDemo;
import latihan.dua.JavaDomParser.ModifyXmlFileDemo;
import latihan.dua.JavaDomParser.QueryXmlFileDemo;


public class JavaDomMenu {
    public static void mulai() {
        int pilihan, back, exit; 
        Scanner scan = new Scanner(System.in);
        System.out.println("======================================================");
        System.out.println("Java DOM Parser");
        System.out.println("======================================================");
        System.out.println("Silahkan pilih program yang akan dijalankan");
        System.out.println("[1] Java DOM Parser Demo");
        System.out.println("[2] Java DOM Query Parser Demo");
        System.out.println("[3] Java DOM Create XML Demo");
        System.out.println("[4] Java DOM Modify XML Demo");
        System.out.println("[5] Back");
        System.out.println("[6] Exit");
        pilihan = scan.nextInt();

        switch (pilihan) {
            case 1:
                DomParserDemo o1 = new DomParserDemo();
                o1.mulai();
                mulai();
                break;
            case 2:
                QueryXmlFileDemo o2 = new QueryXmlFileDemo();
                o2.mulai();
                mulai();
                break;
            case 3:
                CreateXmlFileDemo o3 = new CreateXmlFileDemo();
                o3.mulai();
                mulai();
                break;
            case 4:
                ModifyXmlFileDemo o4 = new ModifyXmlFileDemo();
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