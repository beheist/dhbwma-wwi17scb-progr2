package threads.consumerproducer;

public class Consumer implements Runnable {

    private Lager lager;

    public Consumer(Lager lager) {
        this.lager = lager;
    }

    public void run() {
        while (true) {
            try {
                lager.removeBestand();
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                //
            }
        }
    }
}
