package latihan.satu;

public class HelloThread extends Thread {

    public void run() {
        System.out.println("Hello from a thread!");
    }

    public static void mulai() {
        (new HelloThread()).start();
    }

}