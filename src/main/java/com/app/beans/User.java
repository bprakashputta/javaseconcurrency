package com.app.beans;

public class User {
    private int id;
    private String name;
    private String emaiId;


    public User(int id, String name, String emaiId) {
        this.id = id;
        this.name = name;
        this.emaiId = emaiId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmaiId() {
        return emaiId;
    }

    public void setEmaiId(String emaiId) {
        this.emaiId = emaiId;
    }
}
