package com.giveu.newwebeurekaclient11001.controller;

import com.giveu.newwebeurekaclient11001.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 539892
 * @email yangyu3@giveu.cn
 * @date 2019/11/11 14:41
 * @description 生产者
 */
@RestController
@Slf4j
public class ProductController {

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/user/getUserInfos",method = RequestMethod.GET)
    public String getUserInfos(){
        log.info("来自NewWebEurekaClient11001Application的日志。。。");
        return userService.getUserInfos();
    }

}