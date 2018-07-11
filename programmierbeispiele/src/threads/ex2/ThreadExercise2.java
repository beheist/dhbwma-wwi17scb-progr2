package threads.ex2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ThreadExercise2 {
    public static void main(String[] args) {
        Runnable task = new Runnable() {
            @Override
            public void run() {
                ArrayList<String> messages = new ArrayList<>(Arrays.asList("Foo", "Bar", "Baz", "Qwer", "Wertz"));
                Iterator<String> it = messages.iterator();
                while (it.hasNext()) {
                    System.out.println(it.next());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        System.out.println("I wasn't done!");
                        return;
                    }
                }
            }
        };

        Thread thread = new Thread(task);

        long patience = (long) (Math.random() * 7000);
        try {
            System.out.println("I'll wait for " + patience + " millis!");
            thread.start();
            Thread.sleep(patience);
        } catch (InterruptedException ex) {
            // Nothing
        }

        if(thread.isAlive()) {
            System.out.println("Done waiting. DIE!");
            thread.interrupt();
        } else {
            System.out.println("Lucky you.");
        }

    }
}