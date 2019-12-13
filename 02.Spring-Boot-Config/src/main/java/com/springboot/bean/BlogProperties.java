package com.springboot.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "mrbird.blog")
public class BlogProperties {
	
	//@Value("${mrbird.blog.name}")
	private String name;
	
	//@Value("${mrbird.blog.title}")
	private String title;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
}
