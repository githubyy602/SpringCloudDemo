package com.giveu.newwebeurekaclient11000.controller;

import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.giveu.newwebeurekaclient11000.bean.User;
import com.giveu.newwebeurekaclient11000.service.ILoginService;
import com.giveu.newwebeurekaclient11000.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
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


    @Autowired
    private ILoginService loginService;

    @RequestMapping(value = "/user/getUsers")
    public String getUsers(){
//        log.info("来自NewWebEurekaClient11000Application的日志。。。。");
//        this.justPrintLog();
//        return userService.getUserInfos();
        return null;
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

    @PostMapping(value = "/txc/testTranscation")
    public String testTranscation(){
        log.info("测试分布式事务开始。。。。。");

        int result2 =  loginService.updateUserInfo();
        log.info("第二个服务调用完成,result2 = "+result2 );

        return "success";
    }

}