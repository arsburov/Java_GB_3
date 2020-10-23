import java.sql.ResultSet;
import java.sql.SQLException;

public interface Service<T> {
    ResultSet getUser(User user);
    void rename(T object);
    void loginUser(String login, String pass) throws SQLException;
    boolean add (T object);
}
