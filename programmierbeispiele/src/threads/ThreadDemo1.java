package threads;


public class ThreadDemo1 {
    public static void main(String[] args) {
        Runnable task1 = new Runnable() {
            public void run() {
                for (int i = 0; i <= 10; i++) {
                    System.out.println(i);
                    try {
                        Thread.sleep(250);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        };
        Runnable task2 = new Runnable() {
            @Override
            public void run() {
                for (int i = 10; i >= 0; i--) {
                    System.out.println(i);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        };

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);

        t2.start();
        t1.start();
    }
}