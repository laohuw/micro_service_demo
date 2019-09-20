package org.ms.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demo-service")
public class DemoController {
    @RequestMapping("hello/{name}")
    public String helloService(@PathVariable String name){
        return "hello "+name;
    }
}
