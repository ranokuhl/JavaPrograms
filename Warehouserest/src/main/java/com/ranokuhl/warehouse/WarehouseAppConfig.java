package com.ranokuhl.warehouse.configuration;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.ranokuhl.warehouse.repositories.ProductRepository;
import com.ranokuhl.warehouse.services.ProductService;
import com.ranokuhl.warehouse.services.ProductServiceImpl;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.data.mongodb.core.MongoTemplate;

@SpringBootApplication
public class WarehouseAppConfig {

    public static void main(String[] args) {


        SpringApplication.run(AppConfig.class, args);

    }

}
