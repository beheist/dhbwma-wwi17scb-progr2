package threads.consumerproducer;

public class Producer implements Runnable {

    private Lager lager;

    public Producer(Lager lager) {
        this.lager = lager;
    }

    public void run() {
        while (true) {
            try {
                lager.addBestand();
                Thread.sleep(200);
            } catch (InterruptedException ex) {
                //
            }
        }
    }
}
