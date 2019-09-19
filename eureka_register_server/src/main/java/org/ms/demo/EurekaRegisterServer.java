package org.ms.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaRegisterServer {
    public static void main(String[] args){
        SpringApplication.run(EurekaRegisterServer.class, args);
    }
}
