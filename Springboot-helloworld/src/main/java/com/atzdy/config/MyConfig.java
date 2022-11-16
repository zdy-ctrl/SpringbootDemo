package com.atzdy.config;

import com.atzdy.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/11/2 20:43
 * @Abstract：
 */
@Configuration  //告诉Springboot这是一个配置类 == 配置文件
public class MyConfig {

    //给容器中添加组件。以方法名作为组件的ID 返回类型就是组件类型 返回的值就是在容器中的实例
    @Bean
    public User user01() {
        return new User("张三", 18);
    }

}
