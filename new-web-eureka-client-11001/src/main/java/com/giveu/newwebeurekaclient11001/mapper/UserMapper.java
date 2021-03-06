package com.giveu.newwebeurekaclient11001.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.giveu.newwebeurekaclient11001.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

/**
 * <p>
  * 用户表 Mapper 接口
 * </p>
 *
 * @author Yangy
 * @since 2019-09-26
 */
@Repository
public interface UserMapper extends BaseMapper<User> {

}