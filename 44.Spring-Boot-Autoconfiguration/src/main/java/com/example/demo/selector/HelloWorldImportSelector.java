package com.example.demo.selector;

import com.example.demo.configuration.HelloWorldConfiguration;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author MrBird
 */
public class HelloWorldImportSelector implements ImportSelector {
    //返回全类名，表示该类被注册到容器中
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{HelloWorldConfiguration.class.getName()};
    }
}
