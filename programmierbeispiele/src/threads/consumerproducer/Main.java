package threads.consumerproducer;

public class Main {
    public static void main(String[] args) {
        Lager lager = new Lager();
        Consumer c = new Consumer(lager);
        Producer p = new Producer(lager);

        new Thread(c).start();
        new Thread(p).start();
    }
}
