package com.example.demo.configuration;

import org.springframework.context.annotation.Bean;

/**
 * @author MrBird
 */
//@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String hello() {
        return "hello world";
    }
}
