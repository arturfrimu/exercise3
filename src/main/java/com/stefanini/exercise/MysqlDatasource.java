package com.stefanini.exercise;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MysqlDatasource {
    private final String USER_TABLE = "USER";
    private final String TASK_TABLE = "TASK";
    private final String GROUP_TABLE = "GROUP";
    private final String HOST = "localhost";
    private final String PORT = "3306";
    private final String DB_NAME = "test";
    private final String USER = "root";
    private final String PASSWORD = "02012000Artur";

    Connection dbConn = null;

    public Connection getdbconnection() throws ClassNotFoundException, SQLException {
        String conn_str = "jdbc:mysql://" + HOST + ":" + PORT + "/" + DB_NAME +
                "?characterEncoding=UTF-8&useLegacyDatetimeCode=false&serverTimezone=UTC";

        Class.forName("com.mysql.cj.jdbc.Driver");
        dbConn = DriverManager.getConnection(conn_str, USER, PASSWORD);
        return dbConn;
    }

    public void isConnected() throws SQLException, ClassNotFoundException {
        dbConn = getdbconnection();
        System.out.print(dbConn.isValid(1000));
        System.out.println(" Is connected");
    }

    public List<User> selectAll(String tableName) throws SQLException, ClassNotFoundException {
        return null;
    }

    public User selectUserByUsername(String username) throws SQLException, ClassNotFoundException {
        User user = new User();
        Statement statement = getdbconnection().createStatement();
        String sql = "SELECT * FROM " + USER_TABLE + " WHERE USER_NAME = '" + username + "'";
        ResultSet res = statement.executeQuery(sql);

        while (res.next()) {
            user.setId(res.getInt("ID"));
            user.setFirstName(res.getString("FIRST_NAME"));
            user.setLastName(res.getString("LAST_NAME"));
            user.setUserName(res.getString("USER_NAME"));
            user.setGroupId(res.getInt("GROUP_ID"));
        }
        return user;
    }

    public List<Task> selectUserTasks(String username) throws SQLException, ClassNotFoundException {
        User user = selectUserByUsername(username);
        List<Task> tasks = new ArrayList<>();

        System.out.println(user.getId());
        System.out.println(user.getGroupId());

        Statement statement = getdbconnection().createStatement();
        String sql1 = "SELECT * FROM " + TASK_TABLE + " WHERE " + TASK_TABLE + ".USER_ID = " + user.getId() + " OR "
                + TASK_TABLE + ".GROUP_ID = " + user.getGroupId();

        ResultSet res1 = statement.executeQuery(sql1);

        while (res1.next()) {
            Task task = new Task();
            task.setId(res1.getInt("ID"));
            task.setTitle(res1.getString("TITLE"));
            task.setDescription(res1.getString("DESCRIPTION"));
            task.setGroupId(res1.getInt("GROUP_ID"));
            task.setUserId(res1.getInt("USER_ID"));
            tasks.add(task);
        }
        return tasks;
    }


}