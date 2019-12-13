package com.example.demo;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        // SpringApplication application = new SpringApplication(DemoApplication.class);
        // application.setBannerMode(Banner.Mode.OFF);
        // application.setWebApplicationType(WebApplicationType.NONE);
        // application.setHeadless(true);
        // application.run(args);

        //设置应用类型为NONE，即启动完成后自动关闭
        new SpringApplicationBuilder(DemoApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

        //SpringApplication.run(DemoApplication.class,args);
    }

}
