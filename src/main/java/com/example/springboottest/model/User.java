package com.example.springboottest.model;


import java.io.Serializable;

public class User implements Serializable {
    private String name;
    private String age;

    public User(String name, String age) {
        this.name = name;
        this.age = age;
    }
}
