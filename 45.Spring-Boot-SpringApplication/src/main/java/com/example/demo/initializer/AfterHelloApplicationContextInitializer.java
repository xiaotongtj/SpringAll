package com.example.demo.initializer;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.Ordered;

/**
 * @author MrBird
 *
 * springApplictionRunListeners
 * applicationContextInitinalier  Ordered
 *
 * SpringBootServletInitializer
 */
public class AfterHelloApplicationContextInitializer
        implements ApplicationContextInitializer, Ordered {
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        System.out.println("AfterHelloApplicationContextInitializer: " + applicationContext.getId());
    }

    @Override
    public int getOrder() {
        return Ordered.LOWEST_PRECEDENCE;
    }
}
