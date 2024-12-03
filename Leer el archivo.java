import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("src/main/resources/application.properties")) {
            Properties properties = new Properties();
            properties.load(fis);

            String url = properties.getProperty("jdbc.url");
            String username = properties.getProperty("jdbc.username");
            String password = properties.getProperty("jdbc.password");

            System.out.println("URL: " + url);
            System.out.println("Usuario: " + username);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
