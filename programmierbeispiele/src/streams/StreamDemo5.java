package streams;

import java.io.*;
import java.net.URL;

public class StreamDemo5 {
    public static void main(String[] args) throws IOException {

        URL samuel = StreamDemo5.class.getResource("Samuel_L_Ipsum.txt");
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
