package com.giveu.newwebeurekaclient11001.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

/**
 * @author 539892
 * @email yangyu3@giveu.cn
 * @date 2019/9/25 14:19
 * @description
 */
//@Configuration
//public class DataSourceConfig {
//
//    @Bean(name="dataSource")
//    @ConfigurationProperties(prefix="spring.datasource")
//    public DataSource dataSource(){
//        return new DruidDataSource();
//    }
//
////    // 配置事物管理器
////    @Bean(name="transactionManager")
////    public DataSourceTransactionManager transactionManager(){
////        return new DataSourceTransactionManager(dataSource());
////    }
//
//}