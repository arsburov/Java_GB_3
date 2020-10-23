import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        User user = new User("Aaa", "1234");
        User user1 = new User();
        UserService us = new UserService();
     //   us.add(user);
        us.loginUser("Aaa", "1234");
    }
}
