package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

@Configuration
public class TestConfig {


    @Bean
    @Order(value = Ordered.LOWEST_PRECEDENCE)
    //@DependsOn(value = {"testA"})
    public TestB testB() {
        System.out.println("testB");
        return new TestB();
    }


    @Bean
    @Order(value = Ordered.HIGHEST_PRECEDENCE)
    public TestA testA() {
        System.out.println("testA");
        return new TestA();
    }

}
