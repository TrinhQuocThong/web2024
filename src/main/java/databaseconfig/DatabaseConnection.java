package databaseconfig;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
    private DatabaseConfig config;

    public DatabaseConnection() {
        this.config = new DatabaseConfig();
    }


    public static DatabaseConnection getInsstances() {
        return new DatabaseConnection();
    }

    public Connection getConnection() {
        try {
            Class.forName(config.getDriver());
            return DriverManager.getConnection(config.getUrl(), config.getUser(), config.getPassword());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


    public void close(Connection c) {

        try {

            if (c != null) {
                c.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Add additional methods or logic as needed

    public static void main(String[] args) {

        System.out.println(DatabaseConnection.getInsstances().getConnection());
    }
}

