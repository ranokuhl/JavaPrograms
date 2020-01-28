package com.ranokuhl.warehouse;

import com.ranokuhl.warehouse.configuration.AppConfig;
import com.ranokuhl.warehouse.models.Product;
import com.ranokuhl.warehouse.services.ProductService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class WarehouseApplication {

	public static void main(String[] args) {


	SpringApplication.run(WarehouseApplication.class, args);

	}

}
