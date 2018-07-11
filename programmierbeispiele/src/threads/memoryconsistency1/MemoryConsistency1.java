package threads.memoryconsistency1;


public class MemoryConsistency1 {
    static int x = 0;

    static int getX() {
        return x;
    }

    static void setX(int newX) {
        x = newX;
    }

    private static class Counter extends Thread {
        public void run() {
            while(true) {
                int x = getX();
                System.out.println(getName() + " read: " + x);
                x++;
                setX(x);
                System.out.println(getName() + " wrote: " + x);
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