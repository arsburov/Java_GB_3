import java.sql.ResultSet;
import java.sql.SQLException;

public interface Service<T> {
    T getUser(T object);
    void rename(T object);
    void loginUser(T object) throws SQLException;
    boolean add (T object);
}
