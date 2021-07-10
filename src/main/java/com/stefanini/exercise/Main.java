package com.stefanini.exercise;

import javax.sql.DataSource;
import java.io.*;

public class Main {
    public static final String CREATE_USR_CMD = "-createUser";
    public static final String SHOW_ALL_USR_CMD = "-showAllUsers";
    public static final String ADD_TASK_CMD = "-addTask";
    public static final String SHOW_TASKS_CMD = "-showTasks";
    public static final String ADD_TASK_TO_GROUP = "-addTaskToGroup";

    private static final MysqlDatasource datasource = new MysqlDatasource();

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        if (args.length == 0) {
            System.out.println("no command to execute");
            return;
        }
        String cmd = args[0];
        if (CREATE_USR_CMD.equals(cmd)) {
            saveUserInDatabase();
        } else if (SHOW_ALL_USR_CMD.equals(cmd)) {
            readUsersFromDatabase();
        } else if (ADD_TASK_CMD.equals(cmd)) {
            addTaskToUser();
        } else if (SHOW_TASKS_CMD.equals(cmd)) {
            showUserTasks();
        } else if (ADD_TASK_TO_GROUP.equals(cmd)) {
            addTaskToGroupOfUsers();
        } else {
            System.out.println("incorrect command");
        }
    }

    public static void showUserTasks() throws IOException, ClassNotFoundException {

    }

    public static void saveUserInDatabase() throws IOException {

    }

    public static void readUsersFromDatabase() throws IOException, ClassNotFoundException {

    }



    public static void addTaskToUser() throws IOException, ClassNotFoundException {

    }

    public static void addTaskToGroupOfUsers() throws IOException, ClassNotFoundException {

    }


}



