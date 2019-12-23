package com.giveu.newwebeurekaclient11001.service;

import com.baomidou.mybatisplus.service.IService;
import com.giveu.newwebeurekaclient11001.bean.User;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author Yangy
 * @since 2019-09-26
 */
public interface IUserService extends IService<User> {

	String BASE_URL = "/user";

	@PostMapping(value = BASE_URL + "/getLoginUser")
	String getLoginUser();

	@GetMapping(value = BASE_URL + "/getUserInfos")
	String getUserInfos();

	@PostMapping(value = BASE_URL + "/getUserName")
	String getUserName(String userName);

	@PostMapping(value = BASE_URL + "/updateUser")
	int updateUser(@RequestBody User user);
}
