package streams.properties;

import java.io.*;
import java.net.URL;
import java.util.Iterator;
import java.util.Properties;

public class PropertiesExample {
    public static void main(String[] args) throws IOException {

        Properties properties = new Properties();
        URL propsURL = PropertiesExample.class.getResource("test.properties");
        try (
                InputStream in = propsURL.openStream();
        ) {
            properties.load(in);
            // Ausgabe aller properties
            Iterator<String> it = properties.stringPropertyNames().iterator();
            while (it.hasNext()) {
                String key = it.next();
                System.out.println(key + ": " + properties.getProperty(key));
            }
        }
    }
}
