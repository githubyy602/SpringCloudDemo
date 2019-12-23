package com.giveu.newwebeurekaclient11000.service.Impl;

import com.codingapi.txlcn.tc.annotation.DTXPropagation;
import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.codingapi.txlcn.tc.annotation.TccTransaction;
import com.codingapi.txlcn.tc.annotation.TxcTransaction;
import com.giveu.newwebeurekaclient11000.bean.User;
import com.giveu.newwebeurekaclient11000.mapper.UserMapper;
import com.giveu.newwebeurekaclient11000.service.ILoginService;
import com.giveu.newwebeurekaclient11000.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 539892
 * @email yangyu3@giveu.cn
 * @date 2019/9/20 18:29
 * @description
 */
@Slf4j
@Service
public class LoginServiceImpl implements ILoginService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private IUserService userService;

    @Override
    @LcnTransaction//分布式事务
    @Transactional //本地事务
    public int updateUserInfo() {

        //先调用另一个服务的update操作
        User user1 = new User();
        user1.setId(1);
        user1.setAge(30); //原数据21
        int result1 = userService.updateUser(user1);
        log.info("第一个服务调用完成,result1="+result1);

        if(1<2){
            throw new  RuntimeException("我是测试分布式事务的异常。。。。");
        }

        //再调用本服务update操作
        User otherUser = new User();
        otherUser.setId(2);
        otherUser.setAge(33);//原数据25
        int result = userMapper.updateById(otherUser);
        log.info("来自11000的用户更新结果为："+result);
        return result;
    }
}