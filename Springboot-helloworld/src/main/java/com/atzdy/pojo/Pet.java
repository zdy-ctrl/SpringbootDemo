package com.atzdy.pojo;

import lombok.Data;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/11/2 21:16
 * @Abstract：
 */
@Data
public class Pet {
    private String name;

    public Pet(String name) {
        this.name = name;
    }
}
