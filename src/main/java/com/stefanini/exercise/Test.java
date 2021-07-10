package com.stefanini.exercise;

import java.sql.SQLException;
import java.util.List;

public class Test {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        MysqlDatasource datasource = new MysqlDatasource();
        List<Task> tasks = datasource.selectUserTasks("artur.frimu");
        System.out.println(tasks);
    }
}
