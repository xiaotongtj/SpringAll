package com.example.demo;

import com.example.demo.configuration.HelloWorldConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

    @Autowired
    private HelloWorldConfiguration helloWorldConfiguration;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @RequestMapping("test.do")
    public String test(String name) throws Exception {
        return helloWorldConfiguration.hello() + name;
    }

}
