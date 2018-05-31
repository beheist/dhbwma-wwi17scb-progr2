package basics.cond;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Zahl A:");
        int a = input.nextInt();
        System.out.println("Zahl B:");
        int b = input.nextInt();

        if (a > b) {
            System.out.println("A größer als B");
        } else if (a < b) {
            System.out.println("B größer als A");
        } else {
            System.out.println("A und B sind gleich!");
        }
    }
}
