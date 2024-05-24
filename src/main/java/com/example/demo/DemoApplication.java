package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

/** Example Application Runs the beans from the shared liquibase library */
@SpringBootApplication()
@ComponentScan(basePackages = "com.example.shared.libraries.liquibase")
public class DemoApplication {
	public static void main(String[] args) {
		 new SpringApplicationBuilder(DemoApplication.class).run(args);
	}

}
