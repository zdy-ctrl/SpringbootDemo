package com.atzdy.boot;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/11/9 13:39
 * @Abstract：
 */

import ch.qos.logback.core.boolex.EvaluationException;
import com.atzdy.boot.config.MyConfig;
import com.atzdy.boot.pojo.Pet;
import com.atzdy.boot.pojo.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * 主程序类
 *@SpringBootApplication：这是一个SpringBoot应用
* */
//@SpringBootConfiguration
//@EnableAutoConfiguration
//@ComponentScan
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        //1.返回我们IOC容器
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);
        //2.查看容器里面的组件
        String[] names = run.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println("name = " + name);
        }
//        //3.从容器中获取组件
//        Pet tom01 = run.getBean("tom01", Pet.class);
//
//        Pet tom02 = run.getBean("tom01", Pet.class);
//
//        System.out.println("组件：" + (tom01 == tom02));
//
//        //4.com.atzdy.boot.config.MyConfig$$EnhancerBySpringCGLIB$$b24deba2@466d49f0
//        MyConfig bean = run.getBean(MyConfig.class);
//        System.out.println("bean = " + bean);
//
//        //如果@Configuration(proxyBeanMethods = true)代理对象调用方法。
//        //SpringBoot总会检查这个组件是不是在容器中有   保持组件单实例
//        User user = bean.user01();
//        User user1  = bean.user01();
//        System.out.println(user == user1);
//
//        User user01 = run.getBean("user01", User.class);
//        Pet tom = run.getBean("tom01", Pet.class);
//        System.out.println("用户的宠物是：" + (user01.getPet() == tom01));

       /* //5.获取组件
        String[] beanNamesForType = run.getBeanNamesForType(User.class);
        System.out.println("==========");
        for (String s : beanNamesForType) {
            System.out.println(s);
        }
        EvaluationException bean1 = run.getBean(EvaluationException.class);
        System.out.println("bean1 = " + bean1);*/

        boolean tom01 = run.containsBean("tom01");
        System.out.println("容器中是否有tom01组件 = " + tom01);
        boolean user01 = run.containsBean("user01");
        System.out.println("容器中是否有user01组件 = " + user01);
    }
}
