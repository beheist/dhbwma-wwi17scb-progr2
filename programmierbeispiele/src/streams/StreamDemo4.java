package streams;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.net.URL;

public class StreamDemo4 {
    public static void main(String[] args) throws IOException {

        URL samuel = StreamDemo4.class.getResource("Samuel_L_Ipsum.txt");
        try (
                BufferedReader in = new BufferedReader(new FileReader(samuel.getFile()));
                PrintWriter out = new PrintWriter(new FileWriter("/Users/bastian/Desktop/copy.txt"))
        ) {
            String l;
            while ((l = in.readLine()) != null) {
                out.println(l);
            }
        }
    }
}
