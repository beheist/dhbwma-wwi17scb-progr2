package streams.ex1;

import java.io.*;
import java.net.URL;

public class StreamEx1 {
    public static void main(String[] args) throws IOException {

        URL samuel = StreamEx1.class.getResource("demo.txt");
        try (
                BufferedReader in = new BufferedReader(new FileReader(samuel.getFile()));
        ) {
            String l;
            while ((l = in.readLine()) != null) {
                System.out.println(l);
            }
        }
    }
}
