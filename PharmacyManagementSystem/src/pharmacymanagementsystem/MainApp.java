package pharmacymanagementsystem;

import java.sql.Connection;

public class MainApp {

    public static void main(String[] args) {

        System.out.println("Trying to connect to database...");

        Connection conn = DBConnection.getConnection();

        if (conn != null) {
            System.out.println("✅ Connected successfully!");
        } else {
            System.out.println("❌ Connection failed!");
        }
    }
}