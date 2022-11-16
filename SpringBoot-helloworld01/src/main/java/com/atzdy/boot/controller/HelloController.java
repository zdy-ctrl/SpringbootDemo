package com.atzdy.boot.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Indexed;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/11/9 13:42
 * @Abstract：
 */

//@ResponseBody
//@Controller
@Slf4j
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String handle01() {
        log.info("请求进来了");
        return "Hello,SpringBoot!";
    }
}
