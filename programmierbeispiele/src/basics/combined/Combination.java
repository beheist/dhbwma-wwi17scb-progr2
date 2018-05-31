package basics.combined;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bitte geben Sie eine Zahl ein:");

        int readNr = readIntFromConsole();
        System.out.println("You entered: " + readNr);
    }

    public static int readIntFromConsole() {
        Scanner input = new Scanner(System.in);
        int number;
        while (true) {
            try {
                number = input.nextInt();
                return number;
            } catch (InputMismatchException e) {
                System.out.println("Bitte geben Sie eine Zahl ein!");
                input.next();
            }
        }
    }
}
