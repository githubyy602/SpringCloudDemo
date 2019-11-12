package com.giveu.newwebeurekaclient11002;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class NewWebEurekaClient11002Application {

    public static void main(String[] args) {
        SpringApplication.run(NewWebEurekaClient11002Application.class, args);
        log.info("====NewWebEurekaClient11002Application启动完毕====");
    }

}
