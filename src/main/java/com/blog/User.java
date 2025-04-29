package com.blog;

public class User implements Comparable<User>{
    private int id;
    private String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(User o) {
        return this.id-o.id;
    }
}
