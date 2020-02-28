package com.ranokuhl.grunderapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class GrunderappApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		// SpringApplication.run(GrunderappApplication.class, args);

		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(GrunderAppConfig.class);
	}

}
