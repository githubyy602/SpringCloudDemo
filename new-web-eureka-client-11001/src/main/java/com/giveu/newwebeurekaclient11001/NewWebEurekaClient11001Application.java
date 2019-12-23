package com.giveu.newwebeurekaclient11001;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
//@EnableDiscoveryClient和@EnableEurekaClient共同点就是：都是能够让注册中心能够发现，扫描到改服务。
//不同点：@EnableEurekaClient只适用于Eureka作为注册中心，@EnableDiscoveryClient 可以是其他注册中心。
//@EnableEurekaClient
@EnableFeignClients
@EnableDiscoveryClient
@MapperScan("com.giveu.newwebeurekaclient11001.mapper")
@EnableDistributedTransaction
@Slf4j
public class NewWebEurekaClient11001Application {

	public static void main(String[] args) {
		SpringApplication.run(NewWebEurekaClient11001Application.class, args);
		log.info("====NewWebEurekaClient11001Application启动完毕====");
	}

}
