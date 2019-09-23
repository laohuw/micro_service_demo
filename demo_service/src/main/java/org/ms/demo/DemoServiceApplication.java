package org.ms.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
//@Configuration
//@ComponentScan
//@EnableAutoConfiguration
@EnableDiscoveryClient
@EnableFeignClients
public class DemoServiceApplication {
    public static void main(String[] args){
//        System.setProperty("spring.application.name","demo-service");
        SpringApplication.run(DemoServiceApplication.class, args);
    }

}
