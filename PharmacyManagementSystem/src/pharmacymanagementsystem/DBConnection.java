package pharmacymanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static Connection getConnection() {

        Connection conn = null;

        try {

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            conn = DriverManager.getConnection(
                "jdbc:sqlserver://localhost:1433;databaseName=PharmacySystemManagment;encrypt=true;trustServerCertificate=true;",
                "sa",
                "Sql2025#"
            );

        } catch (Exception e) {
            e.printStackTrace();
        }

        return conn;
    }
}