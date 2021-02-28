package com.zillion.palindrome.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Users {
    @JsonProperty("name")
    private String name;
    @JsonProperty("id")
    private String id;

    private long count;


    public Users() {

    }

    public Users(String name,long count, String id) {
        this.name = name;
        this.count = count;
        this.id = id;

    }

    public Users(String name, long count) {
        this.name = name;
        this.count = count;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
