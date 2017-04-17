package com.model;

/**
 * Created by Administrator on 2017/4/17.
 */
public class User {
    public int id;
    public String age;
    public String username;

    public  User(){
        super();
    }
    public User(int idd, String age ,String username){
        super();
        this.id=id;
        this.age=age;
        this.username=username;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
