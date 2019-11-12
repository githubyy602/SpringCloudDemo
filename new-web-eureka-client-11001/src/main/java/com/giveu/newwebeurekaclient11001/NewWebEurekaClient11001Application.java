package com.giveu.newwebeurekaclient11001;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@MapperScan("com.giveu.newwebeurekaclient11001.mapper")
@Slf4j
public class NewWebEurekaClient11001Application {

	public static void main(String[] args) {
		SpringApplication.run(NewWebEurekaClient11001Application.class, args);
		log.info("====NewWebEurekaClient11001Application启动完毕====");
	}

}