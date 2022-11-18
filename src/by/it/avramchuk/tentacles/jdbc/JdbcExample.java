package by.it.avramchuk.tentacles.jdbc;

import static by.it.avramchuk.tentacles.jdbc.DBParameters.*;

import java.sql.*;

public class JdbcExample {

    public static final String SQL_QUERY = "SELECT * FROM users";

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName(DB_DRIVER);

        try(Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(SQL_QUERY);

            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id") + " - " + resultSet.getString(2) +
                        " - " + resultSet.getString(3)
                        + " - " + resultSet.getString(4));
            }
            //statement.executeUpdate("DELETE FROM users WHERE id=5");
            //statement.executeUpdate("INSERT INTO users (name, login, password) VALUES ('Ava', 'login', 'password')");
            resultSet.absolute(3);


            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id") + " - " + resultSet.getString(2) +
                        " - " + resultSet.getString(3)
                        + " - " + resultSet.getString(4));
            }

        }catch (SQLException e){
            e.printStackTrace();
        }


        //System.out.println(connection);

        System.out.println("+OK+");

    }
}
