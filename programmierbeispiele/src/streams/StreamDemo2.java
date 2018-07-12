package streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

public class StreamDemo2 {
    public static void main(String[] args) throws IOException {

        URL samuel = StreamDemo2.class.getResource("Samuel_L_Ipsum.txt");
        try (
                FileInputStream in = new FileInputStream(samuel.getFile());
                FileOutputStream out = new FileOutputStream("/Users/bastian/Desktop/copy.txt");
        ) {
            int c;

            while ((c = in.read()) != -1) {
                out.write(c);
            }
        }
    }
}
