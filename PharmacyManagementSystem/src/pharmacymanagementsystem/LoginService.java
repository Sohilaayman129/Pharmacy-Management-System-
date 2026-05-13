package pharmacymanagementsystem;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class LoginService {

    public boolean checkLogin(String username, String password) {

        try {
            Connection conn = DBConnection.getConnection();
            Statement st = conn.createStatement();

            String query = "select * from Agents where name = '" 
                    + username + "' and password = '" + password + "'";

            ResultSet rs = st.executeQuery(query);

            return rs.next();

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}