package com.giveu.newwebeurekaserver;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
@Slf4j
public class NewWebEurekaServer12001Application {

    public static void main(String[] args) {
        SpringApplication.run(NewWebEurekaServer12001Application.class, args);
        log.info("====NewWebEurekaServer12001Application启动完毕====");
    }

}
