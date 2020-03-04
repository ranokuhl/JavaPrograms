package com.ranokuhl.xmlparserapp;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableBatchProcessing
@EnableMongoRepositories(basePackages = "com.ranokuhl.xmlparserapp.repositories")
public class XmlparserappApplication {

	public static void main(String[] args) {
		SpringApplication.run(XmlparserappApplication.class, args);
	}

}
