package threads.ex1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ThreadExercise1 {

    public static String alphabet = "";

    private static char getNextChar() {
        // If the alphabet is still empty, we append an "A"
        if (alphabet.length() == 0) {
            return "A".charAt(0);
        }

        // Read the last character
        char lastCharacter = alphabet.charAt(alphabet.length() - 1);
        lastCharacter++;

        return lastCharacter;
    }

    private static synchronized boolean appendNext() {
        char next = getNextChar();
        if (next > "z".charAt(0)) {
            return false;
        }
        alphabet += next;
        System.out.println(alphabet);
        return true;
    }

    public static void main(String[] args) {
        Runnable task = new Runnable() {
            @Override
            public void run() {
                boolean shouldContinue;
                do {
                    shouldContinue = appendNext();
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException ex) {
                        //
                    }
                } while (shouldContinue);
            }
        };

        new Thread(task).start();
        new Thread(task).start();
        new Thread(task).start();
    }
}