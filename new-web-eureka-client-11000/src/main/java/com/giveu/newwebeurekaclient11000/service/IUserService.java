package com.giveu.newwebeurekaclient11000.service;

import com.giveu.newwebeurekaclient11000.bean.User;
import com.giveu.newwebeurekaclient11000.hystrix.UserServiceHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author 539892
 * @email yangyu3@giveu.cn
 * @date 2019/9/20 18:28
 * @description
 */
@FeignClient(name = "service-second",fallback = UserServiceHystrix.class)
public interface IUserService {

    @RequestMapping(value = "/user/getLoginUser",method = RequestMethod.POST)
    String getLoginUser();

    @RequestMapping(value = "/user/getUserInfos",method = RequestMethod.GET)
    String getUserInfos();

    @PostMapping(value = "/user/updateUser")
    int updateUser(@RequestBody User user);

}