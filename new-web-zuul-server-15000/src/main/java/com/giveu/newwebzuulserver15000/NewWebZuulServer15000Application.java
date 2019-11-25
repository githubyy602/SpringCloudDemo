package com.giveu.newwebzuulserver15000;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@Slf4j
@EnableEurekaClient
@EnableZuulProxy
public class NewWebZuulServer15000Application {

	public static void main(String[] args) {
		SpringApplication.run(NewWebZuulServer15000Application.class, args);
		log.info("====NewWebEurekaClient11003Application启动完毕====");
	}

}
