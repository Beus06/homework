package application.database;

import application.tables.MemberState;
import application.tables.Members;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class DBEngine {

    public DBEngine() {
        connection = connect();
    }

    public boolean isConnected() {
        return (connection != null);
    }

    private Connection connection;

    private Connection connect() {
        String url = "jdbc:mysql://localhost:3306/progmatic" +
                "?useUnicode=yes&characterEncoding=UTF-8";

        Properties properties = new Properties();
        properties.put("user", System.getenv("DB_USER"));
        properties.put("password", System.getenv("DB_PASSWORD"));

        try {
            return DriverManager.getConnection(url, properties);
        } catch (SQLException e) {
            return null;
        }
    }

    public List<Members> listAllMembers() {
      //  String query = "SELECT * FROM members";
        String query = new QueryBuilder()
                .select(TableName.MEMBERS)
                .build();

        List<Members> members = new ArrayList<>();

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String stateFromDB = resultSet.getString("state").toUpperCase();
                String emil = resultSet.getString("emil");
                MemberState memberState = MemberState.valueOf(stateFromDB);

                Members member = new Members(id, name, stateFromDB, emil);

                members.add(member);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return members;
    }

}