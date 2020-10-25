import java.sql.*;

public class UserService implements Service<User> {


    @Override
    public User getUser(User user) {
        Connection connection = null;
        try {
            connection = ConnectionFactory.getInstance();
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM users WHERE login = ? AND pass = ?");
            statement.setString(1, user.getLogin());
            statement.setString(2, user.getPass());
            ResultSet resultSet = statement.executeQuery();
            User user1 = new User();
            while (resultSet.next()){
                user1.setLogin(resultSet.getString("login"));
                user1.setPass(resultSet.getString("pass"));
            }
            return user1;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
        return null;
    }

    @Override
    public void rename(User object) {

    }

    @Override
    public void loginUser(User object) {
        User result = getUser(object);
        int i = 0;

        if (result != null)
            i++;
//        try {
//            while(result){
//                i++;
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

        if(i >= 1){
            System.out.println("Login successful");
        }
    }


//    public void loginUser(String login, String pass) {
//       User user = new User("Aaa", "1234");
//       user.setLogin(login);
//       user.setPass(pass);
//       ResultSet result = getUser(user);
//
//       int i = 0;
//
//       try {
//           while(result.next()){
//               i++;
//           }
//       } catch (SQLException e) {
//           e.printStackTrace();
//       }
//
//       if(i >= 1){
//           System.out.println("Login successful");
//       }
//    }

    @Override
    public boolean add(User object) {
        Connection connection = null;
        try {
            connection = ConnectionFactory.getInstance();
            PreparedStatement statement = connection.prepareStatement("INSERT INTO users (login, pass) VALUES (?, ?)");
            statement.setString(1, object.getLogin());
            statement.setString(2, object.getPass());
            return statement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
        return false;
    }
}
