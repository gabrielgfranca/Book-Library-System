package br.com.gabriel.infra;

import java.io.InputStream;
import java.util.Properties;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {

    private static Connection connection;

    public static Connection getConnection() throws SQLException {
        if (connection == null) {
            try {
                Properties properties = new Properties();
                InputStream file = ConnectionDB.class
                        .getClassLoader()
                        .getResourceAsStream("application.properties");

                properties.load(file);

                String url = properties.getProperty("db.url");
                String user = properties.getProperty("db.user");
                String password = properties.getProperty("db.password");

                connection = DriverManager.getConnection(url, user, password);
            } catch (Exception e) {
                throw new RuntimeException("Error connecting to the database: " + e.getMessage());
            }
        }

        return connection;
    }
}
