package com.giveu.newwebeurekaclient11002.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 539892
 * @email yangyu3@giveu.cn
 * @date 2019/11/11 15:57
 * @description
 */
@RestController
@Slf4j
public class Product2Controller {

    @RequestMapping(value = "/user/getUserInfos",method = RequestMethod.GET)
    public String getUserInfos(){
        log.info("来自NewWebEurekaClient11001Application的日志。。。");
        return "i'am just a string";
    }

}