package com.giveu.newwebeurekaclient11001.service;

import com.baomidou.mybatisplus.service.IService;
import com.giveu.newwebeurekaclient11001.bean.User;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author Yangy
 * @since 2019-09-26
 */
public interface IUserService extends IService<User> {
	String getUserInfos();

	String getUserName(String userName);
}
