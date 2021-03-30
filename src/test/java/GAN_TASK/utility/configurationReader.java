package GAN_TASK.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class configurationReader {

    private static final Properties properties = new Properties();
    private static InputStream in;
    private static final String path = "configuration.properties";

    static {
        try {
            in = new FileInputStream(path);
            properties.load(in);
        } catch (Exception e) {
            System.out.println("Failed to load properties file "+e.getMessage());
        }finally {
            try {
                if(in != null)
                    in.close();
            } catch (IOException e) {
                System.out.println("Error while reading properties file. " +e.getMessage());
            }
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}
