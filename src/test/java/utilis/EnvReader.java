package utilis;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class EnvReader {
    public static Properties properties;

    public static Properties getProperties() throws IOException {
        File file = new File(System.getProperty("user.dir") + "/src/test/resources/env.properties");
        FileInputStream fileInputStream = new FileInputStream(file);
        properties = new Properties();
        properties.load(fileInputStream);
        fileInputStream.close();
        return properties;
    }

    public static String getProperty(String key) throws IOException {
        return getProperties().getProperty(key);

    }
}
