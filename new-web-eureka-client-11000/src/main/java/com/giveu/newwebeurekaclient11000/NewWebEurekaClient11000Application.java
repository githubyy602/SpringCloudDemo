package com.giveu.newwebeurekaclient11000;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//eureka客户端注解
@EnableEurekaClient
//feign调用注解
@EnableFeignClients
@RestController
@EnableHystrix
//启动断路器，如果要监控hystrix的流必须开启此注解，即使fegin已经通过属性
@EnableCircuitBreaker
@EnableApolloConfig
@Slf4j
public class NewWebEurekaClient11000Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(NewWebEurekaClient11000Application.class, args);
        log.info("====NewWebEurekaClient11000Application启动完毕====");
    }

}
