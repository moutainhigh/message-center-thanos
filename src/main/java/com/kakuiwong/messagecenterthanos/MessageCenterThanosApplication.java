package com.kakuiwong.messagecenterthanos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableDiscoveryClient
@EnableAsync
@EnableScheduling
@SpringBootApplication
public class MessageCenterThanosApplication {

    public static void main(String[] args) {
        SpringApplication.run(MessageCenterThanosApplication.class, args);
    }

}
