package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
    private final String DB_URL = "jdbc:mysql://localhost:3306/bai_thi?useSSL=false";
    private final String DB_USERNAME = "root";
    private final String DB_PASSWORD = "Daucua123";

    public Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return connection;
    }
}
