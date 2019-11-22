package com.giveu.newwebhystrixdashboard13000;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
//hystrix dashboard调用
@EnableHystrixDashboard
@EnableDiscoveryClient
@EnableTurbine
@Slf4j
public class NewWebHystrixDashboard13000Application {

    public static void main(String[] args) {
        SpringApplication.run(NewWebHystrixDashboard13000Application.class, args);
        log.info("====NewWebHystrixDashboard13000Application启动完毕====");
    }

}
