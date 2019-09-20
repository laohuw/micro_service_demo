package org.ms.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="DEMO-SERVICE", url="http://localhost:8080")
public interface DemoServiceClient {
    @GetMapping("demo-service/hello/{name}")
    public String helloService(@PathVariable String name);
}

