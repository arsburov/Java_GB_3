import java.sql.*;

public class UserService implements Service<User> {


    @Override
    public ResultSet getUser(User user) {
        ResultSet resultSet;
        Connection connection = null;
        try {
            connection = ConnectionFactory.getInstance();
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM users WHERE login = ?");
            statement.setString(1, user.getLogin());
     //       statement.setString(2, user.getPass());
            resultSet = statement.executeQuery();
          return resultSet;
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
    public void loginUser(String login, String pass) throws SQLException {
       User user = new User();
       user.setLogin(login);
       user.setPass(pass);
       ResultSet result = getUser(user);

       int i = 0;

       while(result.next()){
           i++;
       }

       if(i >= 1){
           System.out.println("Login successful");
       }
    }

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
            throw new RuntimeException("Something went wrong during DB-query");
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }
}
