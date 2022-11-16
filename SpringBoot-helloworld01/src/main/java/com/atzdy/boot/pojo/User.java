package com.atzdy.boot.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/11/2 20:39
 * @Abstract：
 */
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class User {
    private String name;
    private Integer age;
    private Pet pet;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
