package com.giveu.newwebeurekaclient11003.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 539892
 * @email yangyu3@giveu.cn
 * @date 2019/11/25 17:15
 * @description
 */
@RestController
public class OrderController {

    @RequestMapping("/user/getUserName")
    public String getUserName(){
        return "Test for zuul, i'm is user2";
    }

}