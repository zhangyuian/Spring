package com.kuang.pojo;

/**
 * @author: zhang
 * @date: 2022/3/4
 * @description:
 */
public class User {
    private String name;

    public User(String name) {
        this.name = name;
        System.out.println("构造器创建");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("name="+name);
    }
}
