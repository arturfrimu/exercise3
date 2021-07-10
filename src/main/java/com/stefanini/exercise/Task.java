package com.stefanini.exercise;

import java.io.Serializable;

public class Task implements Serializable {
    private static final long serialVersionUID = 2737746621951621280L;
//    String username;
    private int id;
    private String title;
    private String description;
    private int groupId;
    private int userId;

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public Task() {}

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", groupId=" + groupId +
                ", userId=" + userId +
                '}';
    }
}
