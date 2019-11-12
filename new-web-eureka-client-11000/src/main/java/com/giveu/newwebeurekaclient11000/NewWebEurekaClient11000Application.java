package com.giveu.newwebeurekaclient11000;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@Slf4j
public class NewWebEurekaClient11000Application {

    public static void main(String[] args) {
        SpringApplication.run(NewWebEurekaClient11000Application.class, args);
        log.info("====NewWebEurekaClient11000Application启动完毕====");
    }

}
