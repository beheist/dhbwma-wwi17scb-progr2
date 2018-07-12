package streams;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;

public class StreamDemo3 {
    public static void main(String[] args) throws IOException {

        URL samuel = StreamDemo3.class.getResource("Samuel_L_Ipsum.txt");
        try (
                FileReader in = new FileReader(samuel.getFile());
                FileWriter out = new FileWriter("/Users/bastian/Desktop/copy.txt");
        ) {
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        }
    }
}
