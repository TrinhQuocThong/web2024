package databaseconfig;

import java.io.InputStream;
import java.util.Properties;

public class DatabaseConfig {
    private String url;
    private String user;
    private String password;
    private String driver;

    public DatabaseConfig() {
        try (InputStream input = getClass().getClassLoader().getResourceAsStream("database.property")) {
            Properties prop = new Properties();
            if (input == null) {
                System.out.println("Sorry, unable to find database.properties");
                return;
            }
            prop.load(input);
            url = prop.getProperty("db.url");
            user = prop.getProperty("db.user");
            driver = prop.getProperty("db.driver");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    // Getters
    public String getUrl() {
        return url;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public String getDriver() {
        return driver;
    }

    public static void main(String[] args) {

    }
}
