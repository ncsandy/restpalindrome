package com.zillion.palindrome.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Users {
    @JsonProperty("name")
    private String name;
    @JsonProperty("id")
    private int id;

    private long count;

    public Users(String name, int id, long count) {
        this.name = name;
        this.id = id;
        this.count = count;
    }

    public Users() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Users{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", count=" + count +
                '}';
    }
}
