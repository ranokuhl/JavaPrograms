package com.ranokuhl.warehouse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WarehouseApplication {

	public static void main(String[] args) {
		SpringApplication.run(WarehouseApplication.class, args);
	}

//	@Bean
//	CommandLineRunner runner(ProductService productService) {
//		return args -> {
//
//			ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
//
//			ObjectMapper mapper = new ObjectMapper();
//			mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
//			TypeReference<List<Products>> typeReference = new TypeReference<List<Products>>(){};
//
//			InputStream inputStream = classLoader.getResourceAsStream("json/product.json");
//
//			try {
//				List<Products> products = mapper.readValue(inputStream,typeReference);
//				System.out.println(products);
//				productService.save(products);
//				System.out.println("Products saved!");
//			} catch(IOException e) {
//				System.out.println("Not able to save products: " + e.getMessage());
//			}
//
//		};
//	}
}
