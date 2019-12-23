package com.giveu.newwebeurekaclient11000.hystrix;

import com.giveu.newwebeurekaclient11000.bean.User;
import com.giveu.newwebeurekaclient11000.service.IUserService;
import org.springframework.stereotype.Component;

/**
 * @author 539892
 * @email yangyu3@giveu.cn
 * @date 2019/11/11 14:50
 * @description
 */
@Component
public class UserServiceHystrix implements IUserService {
    @Override
    public String getLoginUser() {
        return null;
    }

    @Override
    public String getUserInfos() {
        //此处可做降级处理
        return "熔断处理,请求断开";
    }

    @Override
    public int updateUser(User user) {
        return -1;
    }
}