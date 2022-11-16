package com.atzdy.pojo;

import lombok.Data;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/11/2 20:39
 * @Abstract：
 */
@Data
public class User {
    private String name;
    private Integer age;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
