package threads;


public class ThreadDemo0 {
    public static void main(String[] args) {
        Runnable task = new Runnable() {
            @Override
            public void run() {
                String threadName = Thread.currentThread().getName();
                System.out.println("Hello " + threadName);
            }
        };

        task.run();

        Thread thread = new Thread(task);
        thread.start();

        System.out.println("Done!");

    }
}