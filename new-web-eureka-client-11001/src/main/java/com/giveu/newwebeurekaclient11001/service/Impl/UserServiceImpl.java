package com.giveu.newwebeurekaclient11001.service.Impl;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.codingapi.txlcn.tc.annotation.DTXPropagation;
import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.codingapi.txlcn.tc.annotation.TccTransaction;
import com.codingapi.txlcn.tc.annotation.TxcTransaction;
import com.giveu.newwebeurekaclient11001.bean.User;
import com.giveu.newwebeurekaclient11001.mapper.UserMapper;
import com.giveu.newwebeurekaclient11001.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author Yangy
 * @since 2019-09-26
 */
@RestController
@Slf4j
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public String getUserInfos() {
        //测试熔断器效果
        //throw  new  RuntimeException("just for test hystrix");
        EntityWrapper wrapper = new EntityWrapper();
        List<User> users = userMapper.selectList(wrapper);
        return JSON.toJSONString(users);
    }

    @Override
    public String getLoginUser() {
        return null;
    }

    @Override
    public String getUserName(String userName) {
        return "hello , my name is "+userName;
    }

    @Override
    @LcnTransaction//分布式事务
    @Transactional //本地事务
    public int updateUser(@RequestBody  User user) {

        int result = userMapper.updateById(user);
        log.info("11001服务的用户更新结果为："+result);
        return result;
    }
}
