package threads.memoryconsistency2;


public class MemoryConsistency2 {
    static int x = 0;

    static synchronized int incX(){
        return x++;
    }

    private static class Counter extends Thread {
        public void run() {
            while(true) {
                int localX = incX();
                System.out.println(getName() + " wrote: " + localX);
                try {
                    sleep(10);
                } catch (InterruptedException e) {
                    //
                }
            }
        }
    }

    public static void main(String[] args) {
        new Counter().start();
        new Counter().start();
        new Counter().start();
        new Counter().start();
    }
}