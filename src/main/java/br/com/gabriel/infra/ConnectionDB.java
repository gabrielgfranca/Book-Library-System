package br.com.gabriel.infra;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
    private final Properties properties = new Properties();

    public ConnectionDB() {
        try (InputStream file = getClass().getClassLoader().getResourceAsStream("db.properties")) {

            if (file == null) {
                throw new RuntimeException("applications.properties not found.");
            }

            properties.load(file);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(
                properties.getProperty("db.url"),
                properties.getProperty("db.user"),
                properties.getProperty("db.password")
        );
    }
}
