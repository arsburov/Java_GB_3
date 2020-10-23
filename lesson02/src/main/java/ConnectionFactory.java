import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
    public static Connection getInstance() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost/userlist", "root", "");
        } catch (Exception e) {
            throw new RuntimeException("SWW", e);
        }
    }
}
