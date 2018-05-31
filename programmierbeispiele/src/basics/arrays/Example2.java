package basics.arrays;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {

        String[] myStrings = new String[10];
        int[] myInts = new int[10];

        // Counters for each type
        int numberOfStrings = 0;
        int numberOfInts = 0;

        Scanner input = new Scanner(System.in);

        for(int i = 0; i < 10; i++) {
            System.out.print("Eingabe " + i + ":");
            if(input.hasNextInt()) {
                myInts[numberOfInts] = input.nextInt();
                numberOfInts++;
            } else {
                myStrings[numberOfStrings] = input.next();
                numberOfStrings++;
            }
        }

        System.out.println("-----Zahlen------");
        for(int i = 0; i < numberOfInts; i++) {
            System.out.println(myInts[i]);
        }

        System.out.println("------Strings------");
        for(int i = 0; i < numberOfStrings; i++) {
            System.out.println(myStrings[i]);
        }


        input.close();
    }
}
