package com.giveu.newwebeurekaclient11000.bean;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author Yangy
 * @since 2019-09-26
 */
@TableName("user")
@Data
public class User extends Model<User> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id")
	private Integer id;
    /**
     * 用户名
     */
	@TableField("user_name")
	private String userName;
    /**
     * 密码
     */
	private String passwd;
    /**
     * 年龄
     */
	private Integer age;
    /**
     * 邮箱
     */
	private String email;
    /**
     * 手机号
     */
	private String phone;

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
