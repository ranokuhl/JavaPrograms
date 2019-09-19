package com.ranokuhl.warehouse;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ranokuhl.warehouse.models.Products;
import com.ranokuhl.warehouse.services.ProductService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@SpringBootApplication
public class WarehouseApplication {

	public static void main(String[] args) {
		SpringApplication.run(WarehouseApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(ProductService productService) {
		return args -> {

			ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

			ObjectMapper mapper = new ObjectMapper();
			mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
			TypeReference<List<Products>> typeReference = new TypeReference<List<Products>>(){};

			InputStream inputStream = classLoader.getResourceAsStream("json/products.json");

			try {
				List<Products> products = mapper.readValue(inputStream,typeReference);
				productService.save(products);
				System.out.println("Products saved!");
			} catch(IOException e) {
				System.out.println("Not able to save products: " + e.getMessage());
			}

		};
	}
}
