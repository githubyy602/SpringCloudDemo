package com.giveu.newwebeurekaclient11003.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 539892
 * @email yangyu3@giveu.cn
 * @date 2019/11/25 17:15
 * @description
 */
@RestController
@Slf4j
public class OrderController {

    @RequestMapping("/user/getUserName")
    public String getUserName(){
        log.info("来自service-third的日志");
        return "Test for zuul, i'm is user2";
    }

}