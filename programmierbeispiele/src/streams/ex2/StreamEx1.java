package streams.ex2;

import java.io.*;
import java.util.Scanner;

public class StreamEx1 {
    public static void main(String[] args) throws IOException {

        String filepath = "/Users/bastian/Desktop/input.txt";

        try (
                Scanner scanner = new Scanner(System.in);
                BufferedWriter writer = new BufferedWriter(new FileWriter(filepath));
                BufferedReader in = new BufferedReader(new FileReader(filepath));

        ) {
            while (true) {
                if (scanner.hasNext()) {
                    String nextLine = scanner.nextLine();
                    if (nextLine.equals("0")) {
                        writer.flush();
                        String readLine;
                        while ((readLine = in.readLine()) != null) {
                            System.out.println(readLine);
                        }
                        return;
                    }
                    writer.write(nextLine + "\r\n");
                    System.out.println("OK, next line");
                }
            }
        }
    }
}
