package com.giveu.newwebeurekaclient11001.service.Impl;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.giveu.newwebeurekaclient11001.bean.User;
import com.giveu.newwebeurekaclient11001.mapper.UserMapper;
import com.giveu.newwebeurekaclient11001.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author Yangy
 * @since 2019-09-26
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public String getUserInfos() {
        EntityWrapper wrapper = new EntityWrapper();
        List<User> users = userMapper.selectList(wrapper);
        return JSON.toJSONString(users);
    }
}
