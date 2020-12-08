package latihan.satu;

public class ProducerConsumerExample {
    public static void mulai() {
        Drop drop = new Drop();
        (new Thread(new Producer(drop))).start();
        (new Thread(new Consumer(drop))).start();
    }
}