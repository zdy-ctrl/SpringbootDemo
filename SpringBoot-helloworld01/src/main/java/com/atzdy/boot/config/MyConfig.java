package com.atzdy.boot.config;

import ch.qos.logback.core.boolex.EvaluationException;
import com.atzdy.boot.pojo.Pet;
import com.atzdy.boot.pojo.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 1.配置类里面使用@Bean标注在方法上给容器注册组件，默认单实例
 * 2.配置类本身也是组件
 * 3.proxyBeanMethods：代理bean的方法
 *      Full(proxyBeanMethods = true)【保证每个@Bean方法被调用多少次返回的组件都是单实例的】
 *      Lite(proxyBeanMethods = false)【每个@Bean方法被调用多少次返回的组件都是新建的】
 *      组件依赖必须使用Full模式默认，其他默认是Lite模式
 * 4.@Import({User.class,.....})
 *      给容器中自动创建出这个数组里面的类的组件,默认组件的名字就是全类名
 */
//告诉SpringBoot这是一个配置类==配置文件
//@Import({EvaluationException.class})
@Configuration(proxyBeanMethods = false)
public class MyConfig {

    /**
     * 外部无论对配置类中的这个组件注册方法调用多少次获取的都是之前注册容器的单实例
     */
    @ConditionalOnBean(name = "tom")
    @Bean
    //给容器中添加组件，以方法名作为组件的id，返回类型就是组件类型，返回的值及时组件在容器中的实例
    public User user01() {
        User user = new User("张三", 18);
        //user组件依赖了pet组件
        user.setPet(pet01());
        return user;
    }

    //@Bean("tom01")
    public Pet pet01() {
        return new Pet("tomcat");
    }
}
