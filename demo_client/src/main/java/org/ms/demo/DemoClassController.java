package org.ms.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("feign")

public class DemoClassController {
    @Autowired
    private DemoServiceClient demoServiceClient;

    @GetMapping(value="/test")
    public ResponseEntity<String> testClient(){
        if(demoServiceClient!=null){
            String ret=demoServiceClient.helloService("world");
            return new ResponseEntity<String>(ret, HttpStatus.OK);
        }else{
            return new ResponseEntity<>("Error", HttpStatus.FAILED_DEPENDENCY);
        }

    }
}
