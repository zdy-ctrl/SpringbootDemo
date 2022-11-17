package com.atzdy.boot.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/11/17 15:42
 * @Abstract：
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Component
@ConfigurationProperties(prefix = "mycar")
public class Car {
    private String brand;
    private Integer price;
}
