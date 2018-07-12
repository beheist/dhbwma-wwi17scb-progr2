package streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

public class StreamDemo1 {
    public static void main(String[] args) throws IOException {

        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            URL samuel = StreamDemo1.class.getResource("Samuel_L_Ipsum.txt");
            in = new FileInputStream(samuel.getFile());
            out = new FileOutputStream("/Users/bastian/Desktop/copy.txt");
            int c;

            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
