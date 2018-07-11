package threads.consumerproducer;

public class Lager {
    private int bestand = 5;
    private final int maxBestand = 10;

    public synchronized void addBestand() throws InterruptedException {
        if (bestand == maxBestand) {
            threadMsg(": Lager voll, warte!");
            wait();
        }
        bestand++;
        threadMsg(": Neuer Bestand: " + bestand);
        if (bestand > 8) {
            threadMsg(": Lagerbestand > 8, wecke den Consumer!");
            notify();
        }
    }

    public synchronized void removeBestand() throws InterruptedException {
        if (bestand == 0) {
            threadMsg(": Lager leer, warte!");
            wait();
        }
        bestand--;
        threadMsg(": Neuer Bestand: " + bestand);
        if (bestand < 2) {
            threadMsg(": Lagerbestand < 2, wecke den Producer!");
            notify();
        }
    }

    private void threadMsg(String msg){
        System.out.println(Thread.currentThread().getName() + msg);
    }
}
