package latihan.satu;

public class HelloRunnable implements Runnable {

    public void run() {
        System.out.println("Hello from a thread!");
    }

    public static void mulai() {
        (new Thread(new HelloRunnable())).start();
    }

}