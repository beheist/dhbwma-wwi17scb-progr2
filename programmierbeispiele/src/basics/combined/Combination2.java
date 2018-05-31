package basics.combined;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Combination2 {
    public static void main(String[] args) {
        System.out.println("Bitte geben Sie eine Zahl ein:");
        System.out.println("You entered: " + readIntFromConsole());
    }

    private static int readIntFromConsole() {
        Scanner input = new Scanner(System.in);

        while (true) {
            if (input.hasNextInt()) {
                return input.nextInt();
            } else {
                System.out.println("Bitte geben Sie eine Zahl ein.");
                // Durch input.next() pausiert die Schleife bis zur nächsten Eingabe.
                input.next();
            }
        }
    }
}
