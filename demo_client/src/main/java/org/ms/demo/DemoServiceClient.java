package org.ms.demo;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;


@FeignClient(name="DEMO-SERVICE")//, url="http://localhost:8080"
//@RibbonClient(name="demo-service", configuration = DemoServiceConfigration.class)
public interface DemoServiceClient {
    @GetMapping("demo-service/hello/{name}")
//    @LoadBalanced
    public String helloService(@PathVariable("name") String name);
}

