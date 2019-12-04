package com.giveu.newwebeurekaclient11000.controller;

import com.giveu.newwebeurekaclient11000.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 539892
 * @email yangyu3@giveu.cn
 * @date 2019/9/26 10:58
 * @description
 */
@RestController
@Slf4j
public class UserController {

    //apollo上的配置
    @Value("${apollo.config.name}")
    private String apolloConfigName;

    @Resource
    private IUserService userService;

    @RequestMapping(value = "/user/getUsers")
    public String getUsers(){
        log.info("来自NewWebEurekaClient11000Application的日志。。。。");
        this.justPrintLog();
        return userService.getUserInfos();
    }

    @RequestMapping(value = "/user/getUserName")
    public String getUserName(){
        return "Test for zuul, i'm is user1";
    }

    @RequestMapping(value = "/user/getUserNameFromConfig")
    public String getUserNameFromConfig(){
        log.warn("==============测试日志，很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长======");
        return "Hello , my name is " + apolloConfigName;
    }

    private String justPrintLog(){
        log.info("这是来自另一个方法的日志。。。。");
        return "";
    }

}